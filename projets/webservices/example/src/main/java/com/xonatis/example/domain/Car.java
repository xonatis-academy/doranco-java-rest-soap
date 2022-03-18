package com.xonatis.example.domain;

public class Car extends Entity {
	private int seats;
	
	public Car(int seats) {
		this.seats = seats;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
}
