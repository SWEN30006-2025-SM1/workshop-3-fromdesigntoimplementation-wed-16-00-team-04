package com.unimelb.swen30006.workshops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Assignment {
    String description;
    String dueDate;
    String name;
    final int maxAttempts;
    final int assessmentCap = 4;

    private HashMap <String, Submission[]> validSubmissions;
    private HashMap<String, Integer> validSubmissionAttempts;
    // Assuming infinite attempts of invalid submissions, ArrayList DS suits better than Array for invalidSubmissions
    HashMap<String, ArrayList<Submission>> invalidSubmissions;

    String status = "";

    public Assignment (String assignmentDescription, String assignmentDueDate, String assignmentName, int assignmentMaxAttempts) {
        description = assignmentDescription;
        dueDate = assignmentDueDate;
        name = assignmentName;
        maxAttempts = assignmentMaxAttempts;
        validSubmissions = new HashMap<String, Submission[]>();
        validSubmissionAttempts = new HashMap<String, Integer>();
        invalidSubmissions = new HashMap<String, ArrayList<Submission>>();
    }

    public String checkSubmission() {
        if ((description == "") && (dueDate == "") && (maxAttempts > assessmentCap)) {
            status = "Fail";
        } else {
            status = "True";
        }
        return status;
    }

    // Assignment has most information about any Submission and is responsible for knowing about it to test it, so is responsible for creating it
    public boolean Submit(String studID, String[] fnames)
    {
        // Entering student into hashmaps if no previous record of submissions
        if (validSubmissionAttempts.get(studID) == null) {
            validSubmissions.put(studID, new Submission[maxAttempts]);
            validSubmissionAttempts.put(studID, 0);

            if (invalidSubmissions.get(studID) == null) {
                invalidSubmissions.put(studID, new ArrayList<Submission>());
            }
        }
        // Create a new validator and attempt submission
        if (validSubmissionAttempts.get(studID) < maxAttempts) {
            SampleValidator validator = new SampleValidator();
            Submission s = new Submission(studID, validSubmissionAttempts.get(studID) + invalidSubmissions.get(studID).size() + 1, fnames);
            
            if (validator.validateSubmission(s) == null) {
                validSubmissions.get(studID)[validSubmissionAttempts.get(studID)] = s;
                validSubmissionAttempts.put(studID, validSubmissionAttempts.get(studID) + 1);
            }
            else {
                invalidSubmissions.get(studID).add(s);
            }
            return true;
        }
        // Reject submission attempt if max successful submissions have already been accepted
        else {
            System.out.println("Submission cap reached, submission failed!");
            return false;
        }
    }

    public Submission[] validSubmissions(String studID) {
        return Arrays.copyOfRange(validSubmissions.get(studID), 0, validSubmissionAttempts.get(studID));
    }

    public Submission[] invalidSubmissions(String studID) {
        Submission[] inv = new Submission[invalidSubmissions.get(studID).size()];
        for (int i = 0; i < invalidSubmissions.get(studID).size(); i++) {
            inv[i] = invalidSubmissions.get(studID).get(i);
        }
        return inv;
    }
}
