package decisionstrctures;

import java.util.Scanner;

/*salary of employee's 1000$/week. If any employee exceed 10 sales will get an additional bonus of $250*/

public class salarycalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*known values*/
		int salary = 1000;
		int bonus = 250;
		
		
		/*unknown values*/
		System.out.println("How many sales did the employee make this week.");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		
		/* quick detour for the bonus earners*/
		if(sales > 10) {
			salary = salary + bonus;
		}
		/* output*/ 
		System.out.println("The employee's pay is $ " + salary);
		
	}

}
