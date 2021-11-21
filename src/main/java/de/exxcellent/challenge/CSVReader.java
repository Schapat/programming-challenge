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
public class CSVReader implements IReader{
	
	private static String[] colIdentifier;

	public static List<Table> reader(String path) throws IOException {
		List<Table>rows = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		String line = br.readLine();
		int i = 0;
		while (line != null) {
		    	
		    String[] attributes = line.split(",");
		    
		    if(i == 0) {
		    	colIdentifier = attributes;	//first row array stores the headers of the table
		    }
		    
		    if(i > 0) {
		    	Table row = new Table(colIdentifier, attributes);
		    	rows.add(row);
		    }
		    i++;
		    line = br.readLine();  
		}
		return rows;
	}
}