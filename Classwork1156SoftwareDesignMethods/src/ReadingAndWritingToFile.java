import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Mark Mozgovoy 9/19/17
 *
 */

//**********************READS FILE AND OUTPUTS THE SAME FILE WHILE COUNTING LINES
//public class ReadingAndWritingToFile {
//	public static void main(String[] args) throws FileNotFoundException{
//		FileReader reader = new FileReader("input.txt");
//		Scanner in = new Scanner(reader);
//		String currentLine = "";
//		PrintWriter out = new PrintWriter("output.txt");
//		int lineNumber = 1;
//		while(in.hasNextLine()){
//			currentLine = in.nextLine();
//			out.println("/* " + lineNumber + " */ " + currentLine);
//			lineNumber++;
//		}
//		in.close();
//		out.close();
//	}
//}

//**********************READS FILE AND OUTPUTS THE SAME FILE WHILE COUNTING WORDS
//public class ReadingAndWritingToFile {
//	public static void main(String[] args) throws FileNotFoundException{
//		FileReader reader = new FileReader("input.txt");
//		Scanner in = new Scanner(reader);
//		String currentWord = "";
//		PrintWriter out = new PrintWriter("output.txt");
//		int wordNumber = 1;
//		while(in.hasNext()){
//			currentWord = in.next();
//			out.println("/* " + wordNumber + " */ " + currentWord);
//			wordNumber++;
//		}
//		in.close();
//		out.close();
//	}
//}

//**********************READS FILE AND OUTPUTS THE SAME FILE WHILE COUNTING CHARS
//public class ReadingAndWritingToFile {
//	public static void main(String[] args) throws FileNotFoundException{
//		FileReader reader = new FileReader("input.txt");
//		Scanner in = new Scanner(reader);
//		in.useDelimiter("");
//		String currentChar = "";
//		PrintWriter out = new PrintWriter("output.txt");
//		int charNumber = 1;
//		while(in.hasNext()){
//			currentChar = in.next();
//			out.println("/* " + charNumber + " */ " + currentChar);
//			charNumber++;
//		}
//		in.close();
//		out.close();
//	}
//}

//****************************READS FILE AND ADDS ALL DOUBLES, BUT QUITS ON ENCOUNTERING STRING
public class ReadingAndWritingToFile {
	public static void main(String[] args) throws FileNotFoundException, InputMismatchException{
		FileReader reader = new FileReader("input.txt");
		Scanner in = new Scanner(reader);
		
		PrintWriter out = new PrintWriter("output.txt");
		double sum = 0;
		double nextNum;
		while(in.hasNext()){
			try{
				nextNum = in.nextDouble();
				sum += nextNum;
				System.out.println("The sum is " + sum + " after adding " + nextNum + ".");
			}catch(InputMismatchException e){
				System.out.println("ERROR! Double expected!");
				System.out.println("The final sum is " + sum + ".");
				break;
			}
		}
		in.close();
		out.close();
	}
}