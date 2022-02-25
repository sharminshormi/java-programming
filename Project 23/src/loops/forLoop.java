package loops;
/*For loop
 * cashier program that scan a given number of items and tally the cost.
 */

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get number of item to scan
		System.out.println("Enter the number of items you want to scan");
		Scanner scanner = new Scanner(System.in);
		int quantity = scanner.nextInt();
		
		double total = 0;
		//create loop to iterate through all the number of items would you like to scan. 
for (int i= 0; i<quantity; i++) {
	System.out.println("Enter the cost of the items");
	double price = scanner.nextDouble();
	total = total + price;
}
scanner.close();
System.out.println("Your total is $" +total);
	}

}
