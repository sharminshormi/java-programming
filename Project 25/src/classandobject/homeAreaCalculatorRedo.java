package classandobject;

import java.util.Scanner;

/*object as method parameters and return type
 * write a class that creates instances of the rectangle class to find the total area of two rooms 
 */
public class homeAreaCalculatorRedo {
	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 homeAreaCalculatorRedo calculator = new homeAreaCalculatorRedo();
     Rectangle kitchen = calculator.getRoom();
     Rectangle bathroom = calculator.getRoom();
     double area = calculator.calculateTotalArea(kitchen, bathroom);
     System.out.println("The total area is " + area);
     calculator.scanner.close();
	}
public Rectangle getRoom() {
	
	System.out.println("Enter the length of your room.");
	double length =scanner.nextDouble();
	
	System.out.println("Enter the width of your room.");
	double width =scanner.nextDouble();
	
	Rectangle room = new Rectangle(length,width);
	
	
	return room;
}
public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
	return rectangle1.calculateArea() + rectangle2.calculateArea();
}
}
