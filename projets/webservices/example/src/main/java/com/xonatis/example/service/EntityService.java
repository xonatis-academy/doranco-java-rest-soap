package com.xonatis.example.service;

import java.util.ArrayList;
import java.util.Collection;

import org.glassfish.hk2.api.IterableProvider;

import com.xonatis.example.domain.Entity;
import com.xonatis.example.provider.EntityProvider;

import jakarta.inject.Inject;

public class EntityService {

	private Iterable<EntityProvider> providers;

	@Inject
	public EntityService(IterableProvider<EntityProvider> providers) {
		this.providers = providers;
	}
	
	public Iterable<Entity> list() {
		Collection<Entity> results = new ArrayList<Entity>();
		
		for (EntityProvider provider : this.providers) {
			for (Entity entity : provider.list()) {
				results.add(entity);
			}
		}
		
		return results;
	}
	
	public Iterable<Entity> search(String text) {
		return this.list();
	}
	
	public boolean create(Entity entity) {
		return true;
	}
	
}
