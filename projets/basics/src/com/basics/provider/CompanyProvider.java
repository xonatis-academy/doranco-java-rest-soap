package com.basics.provider;

import java.util.ArrayList;
import java.util.Collection;

import com.basics.domain.Company;
import com.basics.domain.Matchable;
import com.basics.domain.Person;

public class CompanyProvider extends MatchableProvider {
	
	public CompanyProvider() {
		this.data = new ArrayList<Matchable>();
		this.data.add(new Company("Google"));
		this.data.add(new Company("Apple"));
		this.data.add(new Company("Microsoft"));
		
	}

}


