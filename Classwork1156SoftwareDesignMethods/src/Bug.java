/**
 * 
 * @author Mark Mozgovoy
 *
 */

public class Bug {
	
	private int position;
	private boolean isFacingRight = true;
	
	public Bug(int initialPosition){
		this.position = initialPosition;
	}
	
	public void turn(){
		this.isFacingRight = !this.isFacingRight;
	}
	
	public void move(){
		if(isFacingRight){
			this.position++;
		}
		else{
			this.position--;
		}
	}
	
	public int getPosition(){
		return this.position;
	}
}
