package Accounts;

import java.util.Random;

public class Technician {

	public final static String[] POSSIBLE_VALUES = { "Harry Styles", "Niall Horan", "Liam Payne"};
    private final static Random random = new Random();
	
    private final static String[] POSSIBLE_VALUES2 = { "Louis Tomlinson", "Zayn Malik"};
    private final static Random random2 = new Random();
   
    public final static String[] technicianName = {"Harry Styles", "Niall Horan", "Liam Payne",  "Louis Tomlinson", "Zayn Malik"};
   

	public static String technicianLvl;
	public static final String  technicianPass = "Technician_admin";


		
	

	public static String getName() {
		return technicianName[1];   // needs to the number of the corresponding technician
	}

	public static String getPass() {
		return technicianPass;
	}

    public static String getRandomValue() {
        return POSSIBLE_VALUES[random.nextInt(POSSIBLE_VALUES.length)];
    }
    public static String getRandomValue2() {
        return POSSIBLE_VALUES2[random2.nextInt(POSSIBLE_VALUES2.length)];
    }
	
}
