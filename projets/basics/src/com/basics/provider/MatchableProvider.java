package com.basics.provider;

import java.util.ArrayList;
import java.util.Collection;

import com.basics.domain.Matchable;

public class MatchableProvider {
	
	protected Collection<Matchable> data;

	public Iterable<Matchable> search(String text) {
		Collection<Matchable> results = new ArrayList<Matchable>();
		
		for (Matchable entry : this.data) {
			if (entry.isMatch(text)) {
				results.add(entry);
			}
		}
		
		return results;
	}
}
