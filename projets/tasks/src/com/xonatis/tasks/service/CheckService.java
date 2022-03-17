package com.xonatis.tasks.service;

import com.xonatis.tasks.domain.EntityCheckable;
import com.xonatis.tasks.provider.EntityCheckableProvider;

public class CheckService {

	private EntityCheckableProvider entityCheckableProvider;
	
	public CheckService(EntityCheckableProvider entityCheckableProvider) {
		this.entityCheckableProvider = entityCheckableProvider;
	}
	
	public Iterable<EntityCheckable> listNotDone() {
		return this.entityCheckableProvider.searchDone(false);
	}
	
	public void check(int id) {
		this.entityCheckableProvider.setDone(id, true);
	}
}
