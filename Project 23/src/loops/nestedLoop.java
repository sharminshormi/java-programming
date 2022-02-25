package loops;

import java.util.Scanner;

/* Nested Loop
 * Find the average of each student's test score 
 */
public class nestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//what we know
		int numberOfStudent = 24;
		int numberOfTest = 4; 
		Scanner scanner = new Scanner(System.in);
		//process all students
		for (int i = 0; i<numberOfStudent; i++) {
			double total = 0;
			for (int j = 0; j<numberOfTest; j++) {
				System.out.println("Enter the score for the test #" + (j+1));
				double score = scanner.nextDouble();
				total = total + score;
			}
			double average = total/numberOfTest;
			System.out.println("The test average for student # " + (i+1) + " is " +average);
		}
scanner.close();
	}

}
