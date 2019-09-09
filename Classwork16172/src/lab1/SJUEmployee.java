package lab1;

//Mark Mozgovoy 1/26/17

public class SJUEmployee {
	
	//instance variables
	String Xnumber;
	int age;
	String fname;
	String lname;
	double salary;
	
	//instance method involving all instance variables.
	public SJUEmployee(String Xnumber, int age, String fname, String lname, double salary){
		this.Xnumber = Xnumber;
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	
	//getters and setters(mutators).
	public String getXnumber() {
		return Xnumber;
	}

	public void setXnumber(String xnumber) {
		Xnumber = xnumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
