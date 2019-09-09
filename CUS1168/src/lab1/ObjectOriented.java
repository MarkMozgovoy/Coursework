package lab1;

/**
 * 
 * @author Mark Mozgovoy 9/14/2018
 *
 */

public class ObjectOriented {
	public static void main(String[] args){
		Circle circle = new Circle(5);
		Square square = new Square(5);
		
		System.out.println("The circle radius is " + circle.radius);
		System.out.println("The square has a side with a length of " + square.side);
		System.out.println("The area of a circle is " + circle.calculateCircleArea());
		System.out.println("The circumference of a circle is " + circle.calculateCirclePerimeter());
		System.out.println("The area of a square is " + square.calculateSquareArea());
		System.out.println("The perimeter of a square is " + square.calculateSquarePerimeter());
	}
}
