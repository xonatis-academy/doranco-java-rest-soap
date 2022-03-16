package com.basics.domain;

public class Person implements Matchable {

	private String firstname;
	private String lastname;
	
	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public boolean isMatch(String text) {
		String searchValue = text.toLowerCase();
		return this.firstname.toLowerCase().contains(searchValue) || this.lastname.toLowerCase().contains(searchValue);
	}

	@Override
	public String toString() {
		return this.firstname + " " + this.lastname;
	}
	
	
}
