package com.unimelb.swen30006.workshops;

public class Driver {
    public static void main(String[] args)
    {
        Staff prof1 = new Staff("1984-10-23", "Prof1", new String[]{"Teacher", "Tutor"}, "ABC123", "123 University Ave");
        Student stud1 = new Student("2004-6-8", "Stud1", "XYZ445", "123 University Ave", "stud1@gmail.com");
        Student stud2 = new Student("2004-10-16", "Stud2", "XZZ669","123 University Ave", "stud2@unimelb.com");
        
        // Create new subject and assigment for students to submit to
        Subject comp30032 = new Subject("Coding Class 101", "COMP101");
        // In a more in-depth implementation creation of this assignment would likely be the responsibility of a Staff object
        comp30032.createAssignment("Please write a 'Hello World' program in C", "2025-3-28", "Hello World in C", 3);

        // stud1 submits "Attempt1.pdf", gets a message that their submission failed and just gives up and uses chatgpt to submit a non-valid attempt
        if (stud1.submitAssignment(comp30032.getAssignment("Hello World in C"), new String[]{"Attempt1.pdf"})) System.out.println("Success");
        if (stud1.submitAssignment(comp30032.getAssignment("Hello World in C"), new String[]{"chatgptanswer.docx", "addendum.txt"})) System.out.println("Success");

        // stud2 submits valid attempts but with wrong answers so they resubmit a bunch, enough to put them over the limit
        if (stud2.submitAssignment(comp30032.getAssignment("Hello World in C"), new String[]{"Attempt1_1.pdf"})) System.out.println("Success");
        if (stud2.submitAssignment(comp30032.getAssignment("Hello World in C"), new String[]{"Attempt1_2.pdf"})) System.out.println("Success");
        if (stud2.submitAssignment(comp30032.getAssignment("Hello World in C"), new String[]{"Attempt1_3.pdf"})) System.out.println("Success");
        if (stud2.submitAssignment(comp30032.getAssignment("Hello World in C"), new String[]{"Attempt1_4.pdf"})) System.out.println("Success");

        // Student 1's valid submissions
        for (Submission s : comp30032.getAssignment("Hello World in C").validSubmissions(stud1.getStudentID())) {
            System.out.println("Submission no. " + s.attemptNum + " was valid.");
        }

        // Student 1's invalid submissions
        for (Submission s : comp30032.getAssignment("Hello World in C").invalidSubmissions(stud1.getStudentID())) {
            System.out.println("Submission no. " + s.attemptNum + " was invalid.");
        }
    }
}
