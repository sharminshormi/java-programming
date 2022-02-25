package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Take input of number of work hours
		System.out.println("Enter number of work hours");
		Scanner scanner = new Scanner(System.in);
		int workHour = scanner.nextInt();
		
		//2. Take input of pay rate
		System.out.println("Enter pay rate");
		double payRate = scanner.nextDouble();
		
		//3. Calculate salary
		double salary = workHour * payRate;
		
		//4. Show salary
		System.out.println("Salary is "+ salary + " Taka");
	}

}
