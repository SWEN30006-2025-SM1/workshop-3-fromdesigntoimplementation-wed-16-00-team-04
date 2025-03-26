package com.unimelb.swen30006.workshops;

import java.time.LocalDate;

public class Staff extends AbstractPerson {
    private String roles[];
    private String staffID;

    public Staff(LocalDate dob, String name, String[] roles, String staffID, String address)
    {
        setDob(dob);
        setName(name);
        setAddress(address);
        this.roles = roles;
        this.staffID = staffID;
    }

    // Setters
    public void setRoles(String[] roles)
    {
        this.roles = roles;
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    // Getters
    public String[] getRoles() {
        return roles;
    }

    public String getStaffID() {
        return staffID;
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public LocalDate getDob() {
        return super.getDob();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

