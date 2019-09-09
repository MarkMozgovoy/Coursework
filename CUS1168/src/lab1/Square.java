package lab1;

/**
 * 
 * @author Mark Mozgovoy 9/14/2018
 *
 */

public class Square {

	double side;
	
	public Square(double side){
		this.side = side;
	}
	
	public double calculateSquareArea(){
		return this.side * this.side;
	}
	
	public double calculateSquarePerimeter(){
		return 4 * this.side;
	}
}
