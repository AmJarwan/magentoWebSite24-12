package MyTestCases;

import java.util.Random;

public class parmetars {

	Random rand = new Random();

	String[] firstNames = { "Sophia", "Liam", "Olivia", "Noah", "Ava", "Jackson", "Isabella", "Lucas", "Mia", "Aiden" };

	String[] lastNames = { "Smith", "Johnson", "Brown", "Williams", "Jones", "Garcia", "Martinez", "Davis", "Rodriguez",
			"Miller" };

	String commonPassword = "Asd123!@#$";
	
	int randomIndex = rand.nextInt(10);
	int randomEmailId = rand.nextInt(9999);
	String emailId = firstNames[randomIndex]+lastNames[randomIndex]+randomEmailId+"@"+"gmail.com" ;

}
