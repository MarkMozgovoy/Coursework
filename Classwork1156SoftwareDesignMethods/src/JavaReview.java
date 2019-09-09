/**
 * 
 * @author Mark Mozgovoy
 *
 */

public class JavaReview {
	public static void main(String[] args){
		patternA(5, 5);//exercise1question1
        System.out.println();
		patternB(5, 5);//exercise1question2
        System.out.println();
		patternC(5, 5);//exercise1question3
        System.out.println();
		patternD(5, 5);//exercise1question4
        System.out.println();
        patternE(5, 5);//exercise1question5
        System.out.println();
        patternF(5, 5);//exercise1question6
	}
	
	public static void patternA(int rows, int columns){
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void patternB(int rows, int columns){
		for(int i = 0; i < rows; i++){
			if(i % 2 == 1){
				System.out.print(" ");
			}
			for(int j = 0; j < columns; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void patternC(int rows, int columns){
		for(int i = 0; i < rows; i++){
			if(i % 2 == 0){
				for(int j = 0; j < columns; j++){
					System.out.print("*");
				}
			}
			else{
				for(int j = 0; j < columns; j++){
					System.out.print("#");
				}
			}
			System.out.print("\n");
		}
	}
	
	public static void patternD(int rows, int columns){
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < i+1; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void patternE(int rows, int columns){
		for(int i = 0; i < rows; i++){
			for(int j = rows - 1; j >= i; j--){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void patternF(int rows, int columns){
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns - i - 1; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}


/**NOTES FOR THE DAY 9/5/17
 * 
 * @author Mark Mozgovoy
 *
 *
 *accessor, return type, class/method name, variables
 *
public class Person{
	private String name;//instance variables
	private int age;
	
	public Person(String name, int age){//constructor, THIS CONSTRUCTOR IS THE SAME AS 4th CONSTRUCTOR
		this.name = name;//CONSTRUCTOR HAS THE SAME NAME AS THE CLASS AND NO RETURN TYPE
		this.age = age;
	}
	public Person(){
		this.name = "";
		this.age = 0;
	}
	public Person(String name){
		this.name = name;
		this.age = 0;
	}
	public Person(String n, int i){
		this.name = n;
		this.age = 0;
	}//MUST DISTINGUISH CONSTRUCTORS (NO SAME NUMBER OF VARIABLES AND SAME DATA TYPES)
	
	
	public void setName(String name){//methods (& getters and setters)
		this.name = name;
	}
	public String getName(){ //getting a private variable via method is called ENCAPSULATION OR INFORMATION HIDING
		return this.name;
	}
}

//INHERITANCE - extends
 * REMEMBER BINARY SEARCH (MUST BE SORTED) AND SEQUENTIAL SEARCH
 */