package de.exxcellent.challenge;

import java.util.List;
/**
 * @author Patrick Scharnow <patrick.scharnow@gmx.de>
 */
public class Calculator implements ITableCalculator {
	/**
	 * This method gets a table list containing rows. 
	 * It calculates the spread between the two parameters of a row and
	 * compares the result of the individual rows.
	 * returns the cell of the row where the minimum spread was calculated.
	 * 
	 * @param rows List with it rows
	 * @param minColName column identifier of the minimal value
	 * @param maxColName column identifier of the maximal value
	 * @param outputCol column identifier of the output
	 * @return resultName identifier of the row with the smallest spread
	 */
	static String calcMinSpread(List<Table> rows, String minColName, String maxColName, String outputCol) {
		float minSpread = Float.MAX_VALUE;
		String resultName = new String();
		
		for(Table row : rows) {
			float spread = Math.abs(Float.parseFloat(row.getRow().get(minColName))
					- Float.parseFloat(row.getRow().get(maxColName)));
			
			if(spread < minSpread) {
				minSpread = spread;
				resultName = row.getRow().get(outputCol);
			}
		 }		
		 return resultName;		
	 }    
}   
