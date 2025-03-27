package com.unimelb.swen30006.workshops;

abstract class AbstractPerson {
	private String address;
	private String dob;
	private String name;

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}

	public String getName() {
		return name;
	}
}
