package lab1;

/**
 * 
 * @author Mark Mozgovoy 9/14/2018
 *
 */

public class Circle {
	
	double radius;
	
	public Circle (double radius){
		this.radius = radius;
	}
	
	public double calculateCircleArea(){
		return Math.PI * this.radius * this.radius;
	}
	
	public double calculateCirclePerimeter(){
		return 2 * Math.PI * this.radius;
	}
}
