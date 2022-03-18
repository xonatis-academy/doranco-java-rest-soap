package com.xonatis.example.provider;

import java.util.ArrayList;

import com.xonatis.example.domain.Car;
import com.xonatis.example.domain.Entity;

public class CarProvider extends EntityProvider {

	public CarProvider() {
		this.data = new ArrayList<Entity>();
		this.data.add(new Car(4));
	}
	
}
