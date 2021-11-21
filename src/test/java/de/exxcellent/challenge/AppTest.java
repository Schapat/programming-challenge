package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {
	List<Table> rows = new ArrayList<Table>();
	
	HashMap<String, String> monday = new HashMap<String, String>();
	HashMap<String, String> friday = new HashMap<String, String>();
	
	@BeforeEach                                         
    void setUp() throws IOException {
		//simulate readLine()
		String[]identifieres = {"day", "minValue", "maxValue"};
		String[]rowDataMonday = {"Monday", "1", "3"};
		String[]rowDataFriday = {"Friday", "2", "10"};
		//create Table obj
		Table monday = new Table(identifieres, rowDataMonday);
		Table friday = new Table(identifieres, rowDataFriday);
	    //add to Table List
		rows.add(monday);
		rows.add(friday);
    }

	@Test
	@DisplayName("Find Team with smallest spread (minValue/maxValue)") 
	void testFindRowWithSmalestSpread() {
	assertEquals("Monday",Calculator.calcMinSpread(rows, "minValue", "maxValue", "day"));
	}


}