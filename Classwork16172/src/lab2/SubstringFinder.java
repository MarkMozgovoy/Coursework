package lab2;

//Mark Mozgovoy 2/8/17

public class SubstringFinder {
	
	public static void main(String[] args){
		String text = "Hello!";
		
		//print out the original string and print results for substring searches
		System.out.println("Original String: " + text);
		System.out.println("The String to Search for (should return true): " + "el");
		System.out.println("The result: " + find(text, "ell"));
		System.out.println("The String to Search for (should return false): " + "oa");
		System.out.println("The result: " + find(text, "oa"));
	}

	public static Boolean find(String text, String str) {
		
		//return false if the length of the searched text is smaller than the searched-for substring
		if(text.length() < str.length()){
			return false;
		}
		
		//check if the first substring the size of the searched-for text
		//use OR operator to check the substring a single index over
		return (text.substring(0, str.length()).equals(str)) || (find(text.substring(1), str));
	}
}
