package loops;

import java.util.Scanner;

/* Do While Loop
 * Allows a user to enter two numbers
 * sum up two numbers
 * User should be able to repeat the action until they indicate they are done.
 */

public class doWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
boolean again;
		do {
			System.out.println("Enter the first number");
			
			double num1 = scanner.nextDouble();
			System.out.println("Enter the second number");
			double num2 = scanner.nextDouble();
			double sum = num1 + num2;
			System.out.println("The sum of two number is :" + sum + ".");
			System.out.println("Would you like to start again?");
			again = scanner.nextBoolean();
			
		} while (again);
		scanner.close();
	}

}
