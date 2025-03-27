package com.unimelb.swen30006.workshops;

import java.util.ArrayList;

public class Subject {

    String subjectName;
    String subjectCode;
    ArrayList<Assignment> subjectAssignments;

    public Subject(String name, String code) {
        subjectName = name;
        subjectCode = code;
        subjectAssignments = new ArrayList<Assignment>();
    }

    public void createAssignment(String assignmentDescription, String assignmentDueDate, String assignmentName, int assignmentMaxAttempts) {
        subjectAssignments.add(new Assignment(assignmentDescription, assignmentDueDate, assignmentName, assignmentMaxAttempts));
        System.out.println("Assignment Created for " + subjectName + ", " + subjectCode);
    }

    public void deleteAssignment(String assignmentName) {
        for (Assignment a : subjectAssignments) {
            if (a.name.equals(assignmentName)) {
                subjectAssignments.remove(a);
                System.out.println("Assignment '" + assignmentName + "' has been deleted, for " + subjectName + ", " + subjectCode);
                return;
            }
        }
        System.out.println("No assignment of that name exists in this subject!");
    }

    public Assignment getAssignment(String assignmentName) {
        for (Assignment a : subjectAssignments) {
            if (a.name.equals(assignmentName)) {
                return a;
            }
        }
        System.out.println("No assignment of this name found!");
        return null;
    }
}
