/**
 * 
 * @author Mark Mozgovoy 9/11/17
 *
 */

/**
 * 
 * This class creates a moth which always moves to the halfway point between itself and a light source.
 *
 */
public class Moth {
	private double position;
	
	public Moth(double initialPosition){
		this.position = initialPosition;
	}
	
	public void moveToLight(double lightPosition){
		this.position = (this.position + lightPosition)/2;
	}
	
	public double getPosition(){
		return this.position;
	}
	
}
