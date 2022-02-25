package decisionstrctures;

import java.util.Scanner;

/* if statements
 * all sales employee are expected to make at least 10 sales/week.
 * for those who do,they receive a congratulatory message. 
 * for those who don't, they are informed for how many sales they were short.
 */

public class quotacalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*known values*/
		int quota = 10;
		/*unknown values*/
		System.out.println("Enter the number of sales you made this week:");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		/* make the decision on the path to take -output*/
		if (sales >= quota) {
			System.out.println("Congrates!! You have met your quota.");
		}
		else {
			int salesShort = quota - sales;
			System.out.println("You did not met your quota. You were " + salesShort + " sales short.");
		}

	}

}
