package passwordCracker;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    
	//initialize several variables comparedPassword is the compared value to the actual password, chars are the available characters for password, salts, and compared value, tries is attempts at a password
	static String comparedPassword = "";
    static String chars = "0123456789aABbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
    static long tries = 0;

    public static void main(String[] args) {
    	
    	//scans for user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the password between 2 and 6 characters (no special characters!): ");
        String password = userInput.nextLine();
        System.out.println("Please wait while the password is cracked. WARNING: This may take a while.");
        //stop listening for user input
        userInput.close();
        
        //calls the function to crack the unsalted password
        crack(password);
        
        //save the values of the first password crack
        long attempts = tries;
        String original = comparedPassword;
        
        //generates a random 2 character salt
		SecureRandom random = new SecureRandom();
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < 2; i++){
			builder.append(chars.charAt(random.nextInt(chars.length())));
		}
		String salt = builder.toString();
		
		//calls the function to crack a salted password
        crack(password + salt);
        System.out.println("The password is: " + original);
        System.out.println("This password took "+ attempts + " attempts to crack.");
        System.out.println("The salted password is: " + comparedPassword);
        System.out.println("This salted password took "+ (tries - attempts) + " attempts to crack.");
        
        //terminate the program to avoid memory leaks
        System.exit(0);
    }

    //function to crack the password
    private static String crack(String password) {
    	
    	//loops for multiple lengths of the password
        for (int length = 2; length <= 8; length++) {
            
        	//initialize the value for comparison
        	comparedPassword = "";
        	
        	//fill the value with 0s
            for (int n = 0; n < length; n++) {
                comparedPassword += "0";
            }
            
            //note the last index of the compared value
            int lastIndex = length - 1;
            
            //break this loop if the password is found
            while (!comparedPassword.equals(password)) {
            	//iterate attempts
            	tries++;
            	
            	//create a temporary string to see if the compared string is all z's
                String end = "";
                for (int n = 0; n < comparedPassword.length(); n++) {
                    end += "z";
                }
                //breaks while loop if the compared value is all z's
                if (comparedPassword.equals(end)) {
                    break;
                }
                
                //keep track of the index in available characters string
                int indexInChars = chars.indexOf(comparedPassword.charAt(lastIndex));
                
                
                if (indexInChars < chars.length() && indexInChars >= 0) {
                	
                	//find out how many z's there are on the end of the string to prepare for iterating up
                    boolean t = true;
                    int amountOfZs = 0;
                    while (t == true) {
                        if (comparedPassword.charAt(comparedPassword.length() - 1 - amountOfZs) == 'z') {
                            amountOfZs++;
                        } else {
                            t = false;
                        }
                    }
                    
                    //make a string of 0's to match the z's on the end of the string
                    String amount0s = "";
                    for (int l = 0; l < amountOfZs; l++) {
                        amount0s += "0";
                    }
                    
                    //iterate the last checked index of the compared value and change the string accordingly
                    if (lastIndex < comparedPassword.length() - 1 && lastIndex > 0) {
                        lastIndex--;
                        indexInChars = chars.indexOf(comparedPassword.charAt(lastIndex)) + 1;
                        comparedPassword = comparedPassword.substring(0, lastIndex) + chars.charAt(indexInChars)
                                + comparedPassword.substring(lastIndex + 1);
                    } else if (comparedPassword.length() - amountOfZs == 1) {//case handle for resetting the first character in the compared value ex: 0zz -> 100
                        comparedPassword = chars.substring(chars.indexOf(comparedPassword.charAt(0)) + 1,
                                chars.indexOf(comparedPassword.charAt(0)) + 2) + amount0s;
                    } else if (comparedPassword.length() - amountOfZs > 1 && amountOfZs != 0) {//case handle for when there are z's on the end ex: 00zz -> 0100
                        comparedPassword = comparedPassword.substring(0, comparedPassword.length() - 1 - amountOfZs)
                                + chars.substring(chars.indexOf(comparedPassword.charAt(comparedPassword.length() - 1 - amountOfZs)) + 1,
                                        chars.indexOf(comparedPassword.charAt(comparedPassword.length() - 1 - amountOfZs)) + 2)
                                + amount0s;
                    } else {//case handle without z's
                        indexInChars = chars.indexOf(comparedPassword.charAt(lastIndex)) + 1;
                        comparedPassword = comparedPassword.substring(0, lastIndex) + chars.charAt(indexInChars);
                    }
                    System.out.println(comparedPassword);//print the compared value
                }
            }
            
            //return the password when it is found
            if (comparedPassword.equals(password)) {
                return comparedPassword;
            }
        }
        //if the password is not found, it will return -1
		return "-1";
    }
}