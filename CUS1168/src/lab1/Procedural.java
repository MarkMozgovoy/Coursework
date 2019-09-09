package lab1;

/**
 * 
 * @author Mark Mozgovoy 9/14/2018
 *
 */

public class Procedural {
	public static void main(String[] args){
		
		double circleRadius = 5;
		double squareSide = 5;
		double circleArea = Math.PI * circleRadius * circleRadius;
		double circlePerimeter = Math.PI * 2 * circleRadius;
		double squareArea = squareSide * squareSide;
		double squarePerimeter = 4 * squareSide;
		
		System.out.println("The circle radius is " + circleRadius);
		System.out.println("The square has a side with a length of " + squareSide);
		System.out.println("The area of a circle is " + circleArea);
		System.out.println("The circumference of a circle is " + circlePerimeter);
		System.out.println("The area of a square is " + squareArea);
		System.out.println("The perimeter of a square is " + squarePerimeter);
	}
}