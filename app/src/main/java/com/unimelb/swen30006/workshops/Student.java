package com.unimelb.swen30006.workshops;

public class Student extends AbstractPerson {
    private String email;
    private String studentID;

    public Student(String dob, String name, String studentID, String address, String email)
    {
        setDob(dob);
        setName(name);
        setAddress(address);
        this.email = email;
        this.studentID = studentID;
    }

    public void sendEmailMsg(String studentEmail)
    {
        System.out.println(getName() + " has been sent email at " + getEmail());
    }

    public float totalGrade()
    {
        return 0f;
    }

    public boolean submitAssignment(Assignment a, String[] fnames)
    {
        return a.Submit(studentID, fnames);
    }

    // Setters
    @Override
    public void setAddress(String address)
    {
        super.setAddress(address);
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    // Getters
    @Override
    public String getAddress()
    {
        return super.getAddress();
    }

    @Override
    public String getDob()
    {
        return super.getDob();
    }

    @Override
    public String getName()
    {
        return super.getName();
    }

    public String getEmail()
    {
        return email;
    }

    public String getStudentID()
    {
        return studentID;
    }
}
