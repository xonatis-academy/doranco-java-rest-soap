package com.basics.service;

import java.util.ArrayList;
import java.util.Collection;

import com.basics.domain.Matchable;
import com.basics.provider.MatchableProvider;

public class SearchService {

	private Iterable<MatchableProvider> providers;
	
	public SearchService(Iterable<MatchableProvider> providers) {
		this.providers = providers;
	}
	
	public Iterable<Matchable> search(String text) {
		
		Collection<Matchable> results = new ArrayList<Matchable>();
		
		for (MatchableProvider provider : this.providers) {
			Iterable<Matchable> providerResults = provider.search(text);
			for (Matchable entry : providerResults) {
				results.add(entry);
			}			
		}
		
		return results;
		
	}
	
}
