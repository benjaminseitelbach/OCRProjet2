package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */

	@Override
	public List<String> getSymptoms() {
		List<String> result = new ArrayList<>();
		
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader (new FileReader(Config.SOURCEFILENAME));
				
			try {
				String line = reader.readLine();
					
				//Loop on all file
				while (line != null) {
						
					result.add(line);
						
					line = reader.readLine();	
				}
					
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
				
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} 
			
		return result;
		
	}
	
}