package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for reading exel's .csv files
 * @author Patrick Scharnow <patrick.scharnow@gmx.de>
 */
public class CSVReader  {

	public static List<String[]> reader(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		List<String[]>rows = new ArrayList<String[]>();

		String line = br.readLine();
		while (line != null) {
		    	
		    String[] attributes = line.split(",");
            rows.add(attributes);

		    line = br.readLine();  
		}
		return rows;
	}
}