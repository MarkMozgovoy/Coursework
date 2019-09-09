package lab2;

//Mark Mozgovoy 2/8/17

public class RecursiveStringReverser {
	
	public static void main(String[] args){
		String text = "Hello!";
		
		//Print original String and then the reversed versions
		System.out.println("Original String: " + text);
		System.out.println("The reverse String (using recursion): " + reverse(text, 0));
		System.out.println("The reverse String (using iteration): " + reverseIteration(text));
	}

	public static String reverseIteration(String text) {
		int i = 0;
		String output = "";
		
		//add the last character to the front of the output string and return it
		while(i <= text.length() - 1){
			output = output + text.charAt(text.length() - 1 - i);
			i++;
		}
		return output;
	}

	public static String reverse(String text, int i) {
		
		//return last character to stop recursion
		if(i == text.length() - 1){
			return text.substring(i);
		}
		
		//reverse rest of text and add on the first character on the end, which reverses the string
		return reverse(text.substring(i+1), 0) + text.substring(0, i + 1);
	}
}