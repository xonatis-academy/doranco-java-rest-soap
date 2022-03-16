package com.basics.provider;

import java.util.ArrayList;
import java.util.Collection;

import com.basics.domain.Matchable;
import com.basics.domain.Person;

public class PersonProvider extends MatchableProvider {
	
	public PersonProvider() {
		this.data = new ArrayList<Matchable>();
		this.data.add(new Person("Vincent", "Time"));
		this.data.add(new Person("Annie", "Versaire"));
		this.data.add(new Person("Johnatan", "Padetoi"));
	}

}
