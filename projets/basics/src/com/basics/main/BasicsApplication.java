package com.basics.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.basics.controller.SearchController;
import com.basics.provider.CompanyProvider;
import com.basics.provider.MatchableProvider;
import com.basics.provider.PersonProvider;
import com.basics.service.SearchService;

public class BasicsApplication {
	

	public static void main(String[] args) {
		
		MatchableProvider companyProvider = new CompanyProvider();
		MatchableProvider personProvider = new PersonProvider();
		
		Collection<MatchableProvider> providers = new ArrayList<MatchableProvider>();
		providers.add(companyProvider);
		providers.add(personProvider);
		
		SearchService searchService = new SearchService(providers);
		SearchController searchController = new SearchController(searchService);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String text = scanner.next();
		Iterable<String> results = searchController.search(text);
		System.out.println(results);	
	}
	
}
