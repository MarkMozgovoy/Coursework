package Exercise7;

import java.util.Scanner;

public class Person {
	private String fName;
	private String lName;
	private String sAddress;
	private String zip;
	private String phoneNum;
	private Scanner in = new Scanner(System.in);
	
	public Person(){
	}
	
	public void setAll(){
		System.out.println("Please enter the first name.");
		this.fName = in.nextLine();
		System.out.println("Please enter the last name.");
		this.lName = in.nextLine();
		System.out.println("Please enter the street address.");
		this.sAddress = in.nextLine();
		System.out.println("Please enter the zip code.");
		this.zip = in.nextLine();
		System.out.println("Please enter the phone number.");
		this.phoneNum = in.nextLine();
	}
	
	public void getAll(){
		System.out.print("Name: " + this.fName + " " + this.lName + " Address: " + this.sAddress + " Zip Code: " + this.zip + " Phone: " + this.phoneNum);
	}
}
