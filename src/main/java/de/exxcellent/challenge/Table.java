package de.exxcellent.challenge;

import java.util.HashMap;
import java.util.List;
/**
 * This class creates table objects. 
 * Each object contains a row with the identifier.
 * @author Patrick Scharnow <patrick.scharnow@gmx.de>
 */
public class Table  {

	private HashMap<String, String> row;
	/**
	 * Constructor of the class
	 * Build a HashMap with the TableHeaders as Key and the rowData as value
	 * @param identifiers are the Tableheaders
	 * @param rowData Array contains data from table row
	 */
	public Table(String[] identifieres, String[] rowData) {
		this.row = new HashMap<String,String>();
		
		for(int i = 0; i < identifieres.length; i++) {
			this.row.put(identifieres[i], rowData[i]);
		}
	}	
	
	public HashMap<String, String> getRow() {
		return row;
	}

}