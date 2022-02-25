package methods;

import java.util.Scanner;

/* Methos
 * Write a method that asks a user his name and greets them by name. 
 */

public class Greetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter your name:");
Scanner scanner = new Scanner(System.in);
String name = scanner.next();
    greetUser(name);
	}
    public static void greetUser(String name) {
    	System.out.println("Hi there," + name);
    }
}
