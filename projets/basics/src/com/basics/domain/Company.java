package com.basics.domain;

public class Company implements Matchable {
	
	private String name;
	
	public Company(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMatch(String text) {
		String searchValue = text.toLowerCase();
		return this.name.toLowerCase().contains(searchValue);
	}

	@Override
	public String toString() {
		return this.name;
	}
	
}
