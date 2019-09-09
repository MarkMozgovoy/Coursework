/**
 * 
 * @author Mark Mozgovoy 9/11/17
 *
 */

/**
 * 
 * This class answers the homework question by showing that the moth class works.
 *
 */
public class MothTest {
	public static void main(String[] args){
		
		//works as intended
		Moth mothsy = new Moth(10);
		System.out.println("The moth is at position " + mothsy.getPosition() + ". The next moth position should be " + (100 + mothsy.getPosition())/2 + ".");
		System.out.println("The moth moves!");
		mothsy.moveToLight(100);
		System.out.println("The moth is at position " + mothsy.getPosition() + " after moving to the light at position 100.0. The moth position should be " + (100 + mothsy.getPosition())/2 + ".");
		System.out.println("The moth moves!");
		mothsy.moveToLight(100);
		System.out.println("The moth is at position " + mothsy.getPosition() + " after moving to the light at position 100.0. The moth position should be " + (100 + mothsy.getPosition())/2 + ".");
		System.out.println("The moth moves!");
		mothsy.moveToLight(100);
		System.out.println("The moth is at position " + mothsy.getPosition() + " after moving to the light at position 100.0. The moth position should be " + (100 + mothsy.getPosition())/2 + ".");
		System.out.println("The moth moves!");
		mothsy.moveToLight(100);
		System.out.println("The moth is at position " + mothsy.getPosition() + " after moving to the light at position 100.0. The moth position should be " + (50 + mothsy.getPosition())/2 + " since the light moved to position 50.0.");
		System.out.println("The moth moves!");
		mothsy.moveToLight(50);
		System.out.println("The moth is at position " + mothsy.getPosition() + " after moving to the light at position 50.0.");
	}
}
