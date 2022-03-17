package com.xonatis.airfrense.provider;

import java.util.ArrayList;

import com.xonatis.airfrense.domain.Bookable;
import com.xonatis.airfrense.domain.Jet;

public class JetProvider extends BookableProvider {

	public JetProvider() {
		this.bookables = new ArrayList<Bookable>();
		this.bookables.add(new Jet());
	}
	
}
