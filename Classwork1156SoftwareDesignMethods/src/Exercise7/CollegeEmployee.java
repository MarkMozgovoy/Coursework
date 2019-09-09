package Exercise7;

import java.util.Scanner;

public class CollegeEmployee extends Person {
	private String SSN;
	private String salary;
	private String dept;
	
	Scanner in = new Scanner(System.in);
	
	public CollegeEmployee() {
	}
	
	public void SetAll(){
		super.setAll();
		System.out.println("Please enter the SSN.");
		this.SSN = in.nextLine();
		System.out.println("Please enter the salary.");
		this.salary = in.nextLine();
		System.out.println("Please enter the department name.");
		this.dept = in.nextLine();
	}
}
