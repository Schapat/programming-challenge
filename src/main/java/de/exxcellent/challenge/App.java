package de.exxcellent.challenge;

import java.io.IOException;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     * @throws IOException 
     */
    public static void main(String... args) throws IOException {

        // Your preparation code …
    	String weatherPath ="src\\main\\resources\\de\\exxcellent\\challenge\\weather.csv";
    	String footballPath ="src\\main\\resources\\de\\exxcellent\\challenge\\football.csv";
    	
        String dayWithSmallestTempSpread = Calculator.calcMinSpread(CSVReader.reader(weatherPath), "MnT", "MxT", "Day");     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = Calculator.calcMinSpread(CSVReader.reader(footballPath),"Goals", "Goals Allowed", "Team"); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
