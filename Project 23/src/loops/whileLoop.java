package loops;

import java.util.Scanner;

/* While loop
 * each employee makes $15 per hour. 
 * Allow employees to enter work hour
 * max hour 40
 * not overtime
 */

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// known variables
	int rate = 15;
	int maxHours = 40;
	
		// unknown variables
	System.out.println("Enter the number of hour you worked");
	Scanner scanner = new Scanner(System.in);
	double workedHours = scanner.nextDouble();
	
	
	// Validate input
	
	while (workedHours > maxHours) {
		System.out.println("Invalid. Your work hour must be between 1 to 40. Try again.");
		workedHours = scanner.nextDouble();
	}
	scanner.close();
		// calculate gross
	double gross = rate*workedHours;
	System.out.println("Gross Pay: $ " + gross + ".");
	}

}
