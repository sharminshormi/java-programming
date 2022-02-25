package decisionstrctures;

import java.util.Scanner;

/*switch statements*/

public class gradeMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter your grade");
         Scanner scanner = new Scanner(System.in);
         String grade = scanner.next();
         scanner.close();
        
         String message;
         switch(grade) {
            case "A":
            	message = "Excellent Job!";
            	break;
            case "B" :
            	message = "Great Job!";
            	break;
            case "C":
            	message = "Good Job!";
            	break;
            case "D":
            	message = "You need to work a bit harder.";;
            	break;
            case "E":
            	message = "You need tpo improve.";
            	break;
            case "F" :
            	message = "Uh oh!!";
            	break;
            default: 
            	message = "Invalid grade.";
            	break;
         }
         System.out.println(message);
	}

}
