package Exercise7;

import java.util.Scanner;

public class Faculty extends CollegeEmployee {
	private boolean tenured;
	private String SSN;
	private String salary;
	private String dept;
	private String fName;
	private String lName;
	private String sAddress;
	private String zip;
	private String phoneNum;
	Scanner in = new Scanner(System.in);
	
	public Faculty() {
	}
	
	public void SetAll(){
		super.SetAll();
		System.out.println("Is the faculty tenured?(true/false)");
		this.tenured = in.nextBoolean();
	}
}
