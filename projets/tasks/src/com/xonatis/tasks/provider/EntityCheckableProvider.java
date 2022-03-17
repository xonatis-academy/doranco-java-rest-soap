package com.xonatis.tasks.provider;

import java.util.ArrayList;
import java.util.Collection;

import com.xonatis.tasks.domain.Checkable;
import com.xonatis.tasks.domain.EntityCheckable;

public abstract class EntityCheckableProvider {
	
	protected Collection<EntityCheckable> data;
	
	public Iterable<EntityCheckable> searchDone(boolean isDone) {
		Collection<EntityCheckable> results = new ArrayList<EntityCheckable>();
		
		for (EntityCheckable item : this.data) {
			if (item.isDone() == isDone) {
				results.add(item);
			}
		}
		
		return results;
	}
	
	public EntityCheckable find(int id) {
		for (EntityCheckable entity : this.data) {
			if (entity.getId() == id) {
				return entity;
			}
		}
		return null;
	}
	
	public void setDone(int id, boolean isDone) {
		EntityCheckable entity = this.find(id);
		entity.setDone(isDone);
	}
	
}
