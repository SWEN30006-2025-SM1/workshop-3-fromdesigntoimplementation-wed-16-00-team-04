package com.unimelb.swen30006.workshops;

public class Subject {

    String subjectName;
    String subjectCode;

    public Subject(String name, String code) {
        subjectName = name;
        subjectCode = code;
    }

    public void createAssignment() {
        System.out.println("Assignment Created for " + subjectName + ", " + subjectCode);
    }

    public void deleteAssignment(String assignmentName) {
        System.out.println("Assignment '" + assignmentName + "' has been deleted, for " + subjectName + ", " + subjectCode);
    }
}
