package com.unimelb.swen30006.workshops;

import java.time.LocalDate;

abstract class AbstractPerson {
	private String address;
	private LocalDate dob;
	private String name;

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public LocalDate getDob() {
		return dob;
	}

	public String getName() {
		return name;
	}
}
