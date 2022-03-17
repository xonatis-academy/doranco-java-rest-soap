package com.xonatis.tasks.domain;

public class Task extends EntityCheckable {

	private String description;
	
	public Task(int id, String description) {
		this.id = id;
		this.description = description;
		this.isDone = false;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return id + ": " + description;
	}
	
}
