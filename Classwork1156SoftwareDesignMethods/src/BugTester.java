/**
 * 
 * @author Mark Mozgovoy
 *
 */

public class BugTester {
	public static void main(String[] args){
		//exercise1Question3.11
		Bug bugsy = new Bug(10);
		System.out.println("The bug is at position " + bugsy.getPosition() + " and is facing right.");
		bugsy.move();
		System.out.println("The bug moved! The bug is at position " + bugsy.getPosition() + ".");
		bugsy.turn();
		System.out.println("The bug turned! The bug is at position " + bugsy.getPosition() + ".");
		bugsy.move();
		System.out.println("The bug moved! The bug is at position " + bugsy.getPosition() + ".");
		bugsy.move();
		System.out.println("The bug moved! The bug is at position " + bugsy.getPosition() + ".");
		bugsy.turn();
		System.out.println("The bug turned! The bug is at position " + bugsy.getPosition() + ".");
		bugsy.move();
		System.out.println("The bug moved! The bug is at position " + bugsy.getPosition() + ".");
		
		System.out.println();
		//exercise1Question3.12
		Moth mothsy = new Moth(10);
		System.out.println("The moth is at position " + mothsy.getPosition() + ".");
		mothsy.moveToLight(100);
		System.out.println("The moth is at position " + mothsy.getPosition() + " after moving to the light at position 100.0.");
		mothsy.moveToLight(100);
		System.out.println("The moth is at position " + mothsy.getPosition() + " after moving to the light at position 100.0.");
		mothsy.moveToLight(100);
		System.out.println("The moth is at position " + mothsy.getPosition() + " after moving to the light at position 100.0.");
		mothsy.moveToLight(100);
		System.out.println("The moth is at position " + mothsy.getPosition() + " after moving to the light at position 100.0.");
	}
}
