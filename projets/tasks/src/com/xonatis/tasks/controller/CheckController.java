package com.xonatis.tasks.controller;

import java.util.ArrayList;
import java.util.Collection;

import com.xonatis.tasks.domain.EntityCheckable;
import com.xonatis.tasks.service.CheckService;

public class CheckController {

	private CheckService service;

	public CheckController(CheckService service) {
		this.service = service;
	}
	
	public Iterable<String> listNotDone() {
		Collection<String> results = new ArrayList<String>();
		
		for (EntityCheckable entity : this.service.listNotDone()) {
			results.add(entity.toString());
		}
		
		return results;
	}
	
	public void check(String id) {
		this.service.check(Integer.parseInt(id));
	}
	
}
