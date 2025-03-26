package com.unimelb.swen30006.workshops;

public class Assignment {
    String description;
    String dueDate;
    String name;
    int maxAttempts;
    final int assessmentCap = 4;
    String status = "";

    public Assignment (String assignmentDescription, String assignmentDueDate, String assignmentName, int assignmentMaxAttempts) {
        description = assignmentDescription;
        dueDate = assignmentDueDate;
        name = assignmentName;
        maxAttempts = assignmentMaxAttempts;
    }

    public String checkSubmission() {
        if ((description == "") && (dueDate == "") && (maxAttempts > assessmentCap)) {
            status = "Fail";
        } else {
            status = "True";
        }
        return status;
    }

}
