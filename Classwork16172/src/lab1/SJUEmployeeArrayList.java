package lab1;

//Mark Mozgovoy 1/26/17

import java.util.ArrayList;

public class SJUEmployeeArrayList {
	
	public static void main(String args[]){
		
		//create array list of employees and add entries.
		ArrayList<SJUEmployee> employeeList = new ArrayList<SJUEmployee>();
		employeeList.add(new SJUEmployee("X03302272", 35, "Bob", "Jackson", 25000.00));
		employeeList.add(new SJUEmployee("X75968432", 42, "Jack", "Wilson", 50000.00));
		employeeList.add(new SJUEmployee("X96045837", 27, "Max", "Smith", 100000.00));
		employeeList.add(new SJUEmployee("X43285943", 37, "Will", "Johnson", 75000.00));
		employeeList.add(new SJUEmployee("X37295960", 56, "Mike", "White", 15000.00));
		System.out.println("The complete list of SJU Employees: ");
		
		//print out all info about every employee by index.
		for(int i = 0; i < employeeList.size(); i++){
			String output = "\n";
			output += "First Name: " + employeeList.get(i).getFname() + "\n";
			output += "Last Name: " + employeeList.get(i).getLname() + "\n";
			output += "X Number: " + employeeList.get(i).getXnumber() + "\n";
			output += "Age: " + employeeList.get(i).getAge() + "\n";
			String sal = String.format("$%,.2f", employeeList.get(i).getSalary());
			output += "Salary: " + sal + "\n";
			System.out.println("Employee " + (i + 1) + "'s info: " + output);
		}
		
		//print average, lowest, and highest salaries.
		System.out.println("The average salary of the employees is: " + String.format("$%,.2f", averageSalary(employeeList)));
		printLowestSalaryInfo(employeeList);
		printHighestSalaryInfo(employeeList);
	}
	
	public static void printHighestSalaryInfo(ArrayList<SJUEmployee> list) {
		//set highest salaried employee as the first employee by index.
		SJUEmployee highestEmployee = list.get(0);
		
		//Change the highest salaried employee if the compared employee has a higher salary.
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getSalary() > highestEmployee.getSalary()){
				highestEmployee = list.get(i);
			}
		}
		
		//print the info of highest salaried employee.
		System.out.println("\nThe info of the employee with the highest salary: ");
		String output = "";
		output += "First Name: " + highestEmployee.getFname() + "\n";
		output += "Last Name: " + highestEmployee.getLname() + "\n";
		output += "X Number: " + highestEmployee.getXnumber() + "\n";
		output += "Age: " + highestEmployee.getAge() + "\n";
		String sal = String.format("$%,.2f", highestEmployee.getSalary());
		output += "Salary: " + sal + "\n";
		System.out.println(output);
	}

	public static void printLowestSalaryInfo(ArrayList<SJUEmployee> list) {
		//set lowest salaried employee as the first employee by index.
		SJUEmployee lowestEmployeee = list.get(0);
		
		//change lowest salaried employee if the compared employee has a lower salary.
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getSalary() < lowestEmployeee.getSalary()){
				lowestEmployeee = list.get(i);
			}
		}
		
		//print lowest salaried employee's info.
		System.out.println("\nThe info of the employee with the lowest salary: ");
		String output = "";
		output += "First Name: " + lowestEmployeee.getFname() + "\n";
		output += "Last Name: " + lowestEmployeee.getLname() + "\n";
		output += "X Number: " + lowestEmployeee.getXnumber() + "\n";
		output += "Age: " + lowestEmployeee.getAge() + "\n";
		String sal = String.format("$%,.2f", lowestEmployeee.getSalary());
		output += "Salary: " + sal + "\n";
		System.out.println(output);
	}

	public static double averageSalary(ArrayList<SJUEmployee> list){
		//sum up all of the employees' salaries and divide them by the size of the employee array list.
		double average = 0.0;
		for(int i = 0; i < list.size(); i++){
			average += list.get(i).getSalary();
		}
		average = average / list.size();
		return average;
	}
	
	
}
