package com.xonatis.airfrense.provider;

import java.util.ArrayList;
import com.xonatis.airfrense.domain.Cancelable;

public class TicketProvider extends CancelableProvider {

	public TicketProvider() {
		this.data = new ArrayList<Cancelable>();
	}

}
