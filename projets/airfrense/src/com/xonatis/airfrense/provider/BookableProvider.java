package com.xonatis.airfrense.provider;

import java.util.Collection;

import com.xonatis.airfrense.domain.Bookable;

public abstract class BookableProvider {

	protected Collection<Bookable> bookables;
	
	public Iterable<Bookable> list() {
		return this.bookables;
	}
	
}
