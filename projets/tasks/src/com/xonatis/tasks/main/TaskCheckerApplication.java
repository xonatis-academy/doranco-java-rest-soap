package com.xonatis.tasks.main;

import java.util.Scanner;

import com.xonatis.tasks.controller.CheckController;
import com.xonatis.tasks.provider.EntityCheckableProvider;
import com.xonatis.tasks.provider.TaskProvider;
import com.xonatis.tasks.service.CheckService;

public class TaskCheckerApplication {
	
	public static void main(String[] args) {
		
		EntityCheckableProvider provider = new TaskProvider();
		CheckService service = new CheckService(provider);
		CheckController controller = new CheckController(service);

		while(true) {
			System.out.println("Liste des taches a effectuer :");
			Iterable<String> tasks = controller.listNotDone();
			for (String task : tasks) {
				System.out.println(task);
			}
		
			Scanner scanner = new Scanner(System.in);
			System.out.print("Quelle tache voulez-vous marquer comme effectuee ? ");
		    String text = scanner.next();
		    if (text.equals("x")) {
		    	break;
		    }
		    
		    controller.check(text);
		}
		
	}
	
}
