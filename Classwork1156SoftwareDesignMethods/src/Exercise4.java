import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Mark Mozgovoy 9/29/17
 *
 */
public class Exercise4 {
	public static void main(String[] args) throws InputMismatchException{
		//EXERCISE 4 QUESTION 2
//		Scanner in = new Scanner(System.in);
//		int chances = 2;
//		double sum = 0;
//		while(chances > 0){
//			try{
//				in = new Scanner(System.in);
//				System.out.println("Please enter a double.");
//				double userInput = in.nextDouble();
//				sum += userInput;
//				System.out.println("You entered " + userInput + "!");
//				System.out.println("The sum is " + sum + ".");
//			}catch(InputMismatchException e){
//				chances--;
//				System.out.println("Wrong input, " + chances + " left!");
//				continue;
//			}
//		}
//		in.close();
		
		//EXERCISE 4 QUESTION 3 DOES NOT WORK
		Scanner in = new Scanner(System.in);
		double sum = 0;
		double userInput = 0;
		boolean running = true;
		while(running){
			try{
				in = new Scanner(System.in);
				System.out.println("Please enter a double.");
				userInput = in.nextDouble();
				sum += userInput;
				System.out.println("You entered " + userInput + "!");
				System.out.println("The sum is " + sum + ".");
			}catch(InputMismatchException e){
				Double userInputValue = userInput;
				String checkString = userInputValue.toString();
				if(checkString.equals("")){
					System.out.println("You entered a blank String.");
					running = false;
					break;
				}
				System.out.println("Wrong input!");
				continue;
			}
		}
		in.close();
	}
}
