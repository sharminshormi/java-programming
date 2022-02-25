package methods;

import java.util.Scanner;


/* Variable Scope
 * write an instant credit check program that allows
 * anyone who makes more than $25000 and has a credit score
 * of 700 or better. Reject all other.
 */

public class variableScope {
	static int requiredSalary = 25000;
	static int requiredCreditScore = 700;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		what we know
		int requiredSalary = 25000;
		int requiredCreditScore = 700;*/
		//what we don't know
		double salary = getSalary();
		int creditScore = getCreditScore();
		scanner.close();
       //check if the user is qualified
		boolean qualified = isUserQualified(creditScore , salary);
		/*notify the user*/
		notifyUser(qualified);
	}
	/*public static void getFromData() {
		System.out.println("Enter your salary");
		*Scanner scanner = new Scanner(System.in);
		*double salary = scanner.nextDouble();
		
		*System.out.println("Enter your credit score");
		*double score = scanner.nextDouble();
		scanner.close();*/
		public static double getSalary(){
			System.out.println("Enter your salary");
			//Scanner scanner = new Scanner(System.in);
			double salary = scanner.nextDouble();
			return salary;
		}
		public static int getCreditScore() {
			System.out.println("Enter your credit score");
			int creditScore = scanner.nextInt();
			return creditScore;
		}
	
     public static boolean isUserQualified(int creditScore , double salary) {
    	 if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
    	 return true;
     }
    	 else {
    		 return false;
    	 }
     }
    	 public static void notifyUser(boolean isQualified) {
    		 if(isQualified) {
    			 System.out.println("congrats!! You've been approved");
    		 }
    		 else {
    			 System.out.println("Sorry. You've been declined");
    	 } 
}
}
