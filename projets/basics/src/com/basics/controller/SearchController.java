package com.basics.controller;

import java.util.ArrayList;
import java.util.Collection;

import com.basics.domain.Matchable;
import com.basics.service.SearchService;

public class SearchController {
	
	private SearchService service;

	public SearchController(SearchService service) {
		this.service = service;
	}

	public Iterable<String> search(String text) {
		Collection<String> results = new ArrayList<String>();
		
		Iterable<Matchable> serviceResults = this.service.search(text);
		for (Matchable entry : serviceResults) { 
			results.add(entry.toString());
		}
		
		return results;
	}

}
