package decisionstrctures;

import java.util.Scanner;

/* nestedif
 * to qualify a loan a person must make at least $30000
 * and have been working at their current job for at least 2 years
 */

public class LoanQualifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize what we know
		int requiredSalary = 30000;
		int requiredYearsEmployed = 2;
		// don't know
		System.out.println("Enter Your Salary");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		
		System.out.println("Enter The Number Of Year With Your Current Employer");
		double years = scanner.nextDouble();
		scanner.close();
		//make decision
		if (salary >= requiredSalary) {
			
			if (years >= requiredYearsEmployed) {
				System.out.println("Congrats!! You qualify for the loan.");	
			}
			else{
				
				System.out.println("Sorry!! You must have worked at your current job "
				  + requiredYearsEmployed + " years. ");	
			}
			
		}
	
	else{
		System.out.println("Sorry!! You must earn at least $ " + requiredSalary + " to qualify for the loan.");
	}
		if(salary < requiredSalary){
			if(years < requiredYearsEmployed){
				System.out.println(" Your salary must have at least" + requiredSalary + "and also you have to work the current job for at least"
						+ requiredYearsEmployed + "years");
				
			}
		}
	
}

}
