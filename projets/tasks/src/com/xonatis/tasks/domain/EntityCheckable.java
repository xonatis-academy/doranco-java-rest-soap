package com.xonatis.tasks.domain;

public abstract class EntityCheckable implements Checkable {

	protected int id;
	protected boolean isDone;
	
	public int getId() {
		return id;
	}
	
	public boolean isDone() {
		return isDone;
	}
	
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
}
