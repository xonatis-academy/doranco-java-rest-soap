package com.xonatis.example.provider;

import java.util.ArrayList;

import com.xonatis.example.domain.Entity;
import com.xonatis.example.domain.Truck;

public class TruckProvider extends EntityProvider {

	public TruckProvider() {
		this.data = new ArrayList<Entity>();
		this.data.add(new Truck("Gangsta Truck"));
	}
	
}
