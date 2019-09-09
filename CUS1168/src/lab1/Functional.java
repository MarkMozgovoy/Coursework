package lab1;

/**
 * 
 * @author Mark Mozgovoy 9/14/2018
 *
 */

public class Functional {
	public static void main(String args[]){
		
		double radius = 5;
		double side = 5;
		
		System.out.println("The circle radius is " + radius);
		System.out.println("The square has a side with a length of " + side);
		System.out.println("The area of a circle is " + calculateCircleArea(radius));
		System.out.println("The circumference of a circle is " + calculateCirclePerimeter(radius));
		System.out.println("The area of a square is " + calculateSquareArea(side));
		System.out.println("The perimeter of a square is " + calculateSquarePerimeter(side));
	}
	
	public static double calculateCircleArea(double radius){
		double area = Math.PI * radius * radius;
		
		return area;
	}
	
	public static double calculateCirclePerimeter(double radius){
		double perimeter = Math.PI * 2 * radius;
		
		return perimeter;
	}
	
	public static double calculateSquareArea(double side){
		double area = side * side;
		
		return area;
	}
	
	public static double calculateSquarePerimeter(double side){
		double perimeter = side * 4;
		
		return perimeter;
	}
}
