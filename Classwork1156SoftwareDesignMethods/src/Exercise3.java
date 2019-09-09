import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Mark Mozgovoy 9/22/17
 *
 */
public class Exercise3 {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter the file name below");
        String input = userInput.next();//for some reason this works
        int totalWords = 0;
        int totalCharacters = 0;
        int totalLines = 0;
        
        while(!input.equals("-1")){
		
	        //String output = userInput.next();
			File in = new File(input);
			Scanner inFile = new Scanner(in);
			//PrintWriter outFile = new PrintWriter("output.txt");
			int charCount = 0;
			int wordCount = 0;
			int lineCount = 0;
			
			while(inFile.hasNext()){
				String word = inFile.next();   
				wordCount++;
				totalWords++;
			}
			
			inFile = new Scanner(in);
			inFile.useDelimiter("");
			while(inFile.hasNext()){
	            String character = inFile.next();
				charCount++;
				totalCharacters++;
			}
			
			inFile = new Scanner(in);
			while(inFile.hasNextLine()){
				String line = inFile.nextLine();       
				lineCount++;
				totalLines++;
			}
			
			System.out.println("The input file has " + charCount + " characters.");
			System.out.println("The input file has " + wordCount + " words.");
			System.out.println("The input file has " + lineCount + " lines.");
			inFile.close();
			System.out.println("Please enter the file name below");
		    input = userInput.next();//for some reason this works
		}
        System.out.println("All listed input files had a total of " + totalCharacters + " characters.");
        System.out.println("All listed input files had a total of " + totalWords + " words.");
        System.out.println("All listed input files had a total of " + totalLines + " lines.");
	}
}

