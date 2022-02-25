package decisionstrctures;

import java.util.Scanner;

/* Logical operators
 * to qualify a loan a person must make at least $30000
 * and have been working at their current job for at least 2 years
 */

public class logicalOperatorLoanQualifier {

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
				if (salary >= requiredSalary && years >= requiredYearsEmployed) {
						System.out.println("Congrats!! You qualify for the loan.");	
					}	
			
			else{
				System.out.println("Sorry!! You must earn at least $ " + requiredSalary + " and also have to work for " + requiredYearsEmployed + " years to qualify for the loan.");
			}
				
         }
   }

