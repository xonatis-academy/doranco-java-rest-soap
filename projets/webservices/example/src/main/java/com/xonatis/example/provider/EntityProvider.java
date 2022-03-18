package com.xonatis.example.provider;

import java.util.Collection;

import com.xonatis.example.domain.Entity;

public class EntityProvider {

	protected Collection<Entity> data;
	
	public Iterable<Entity> list() {
		return this.data;
	}
	
}
