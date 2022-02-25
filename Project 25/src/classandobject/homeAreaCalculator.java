package classandobject;
/*Instantiating object
 * write a class that creates instances of the rectangle class to find the total area of two rooms 
 */
public class homeAreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Rectangle 1*/
		//create instances of rectangle class
		Rectangle room1 = new Rectangle();
		room1.setWidth(25);
		room1.setLength(50);
		double areaOfRoom1 = room1.calculateArea();
		/*Rectangle 2*/
		//create instances of rectangle class
		
		Rectangle room2 = new Rectangle( 30, 75);
		double areaOfRoom2 = room2.calculateArea();
		double totalArea = areaOfRoom1 + areaOfRoom2;
		System.out.println("Area of both rooms:" + totalArea);
	}

}
