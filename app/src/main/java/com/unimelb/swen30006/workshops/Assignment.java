package com.unimelb.swen30006.workshops;

public class Assignment {
    String description;
    String dueDate;
    String name;
    int maxAttempts;

    public Assignment (String assignmentDescription, String assignmentDueDate, String assignmentName, int assignmentMaxAttempts) {
        description = assignmentDescription;
        dueDate = assignmentDueDate;
        name = assignmentName;
        maxAttempts = assignmentMaxAttempts;
    }

    public Submission[] invalidSubmission() {
        ;
    }

    public Submission[] validSubmission() {
        ;
    }

}
