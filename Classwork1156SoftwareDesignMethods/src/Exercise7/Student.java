package Exercise7;

import java.util.Scanner;

public class Student extends Person{
	private String fName;
	private String lName;
	private String sAddress;
	private String zip;
	private String phoneNum;
	private Scanner in = new Scanner(System.in);
	
	public Student(){
	}
	
	public void setAll(){
		super.setAll();
		
	}
	
	public void getAll(){
		System.out.print("Name: " + this.fName + " " + this.lName + " Address: " + this.sAddress + " Zip Code: " + this.zip + " Phone: " + this.phoneNum);
	}
}
