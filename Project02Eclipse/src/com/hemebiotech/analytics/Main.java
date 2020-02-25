package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Program start");
		
		List<String> symptoms = new ReadSymptomDataFromFile().getSymptoms();
			
		Map<String, Integer> symptomsCounter = new SymptomsCounter(symptoms).getSymptomsCounter();
			 			
		Map<String, Integer> sortedSymptomsCounter = new AlphabeticalOrder(symptomsCounter).getSymptomsCounterAlphabetically();
			
		new WriteSymptomData(sortedSymptomsCounter).write();
						
		System.out.println("Program end");

	}

}
