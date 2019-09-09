package quiz;
/**
 * 
 * @author Mark Mozgovoy 10/17/2017
 *
 */
public class Employee implements Measurable {
	private String name;
	private String employeeID;
	private double salary;
	
	public Employee(String name, String employeeID, double salary){
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
	}
	public double getSalary(){
		return this.salary;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getID(){
		return this.employeeID;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
}
