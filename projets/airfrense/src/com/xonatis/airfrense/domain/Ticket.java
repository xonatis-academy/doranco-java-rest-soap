package com.xonatis.airfrense.domain;

public class Ticket implements Cancelable {

	private String person;
	private int reference;
	private String departure;
	private String from;
	private String to;
	
	public Ticket(String person, String departure, String from, String to, int reference) {
		this.person = person;
		this.reference = reference;
		this.departure = departure;
		this.from = from;
		this.to = to;
	}
	
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}

	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Reference : " + reference + "\n" + person + "\n" + departure + "\n" + from + " -> " + to;
	}
	
	
}
