package com.xonatis.tasks.provider;

import java.util.ArrayList;

import com.xonatis.tasks.domain.Task;
import com.xonatis.tasks.domain.EntityCheckable;

public class TaskProvider extends EntityCheckableProvider {
	
	public TaskProvider() {
		this.data = new ArrayList<EntityCheckable>();
		this.data.add(new Task(1, "Developper un robot magique"));
		this.data.add(new Task(2, "Acheter une licorne"));
		this.data.add(new Task(3, "Partir vivre dans une tasse"));
		this.data.add(new Task(4, "Ajouter des enceintes a la bouteille d'eau"));
	}
	
}
