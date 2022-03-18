package com.xonatis.example.domain;

public class Truck extends Entity {
	private String name;

	public Truck(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
