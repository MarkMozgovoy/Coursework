package quiz;
/**
 * 
 * @author Mark Mozgovoy 10/17/2017
 *
 */
import java.text.DecimalFormat;

public class DataSetTester {
	public static void main(String[] args){
		final DecimalFormat df = new DecimalFormat(".00");
		DataSet set = new DataSet();
		Employee employee1 = new Employee("Jeff", "12345", 55000);
		Employee employee2 = new Employee("Mark", "56789", 78000);
		Employee employee3 = new Employee("Mike", "34756", 70000);
		Employee employee4 = new Employee("Wilson", "96807", 60000);
		Employee employee5 = new Employee("Max", "46587", 100000);
		set.add(employee1);
		System.out.println("Employee with name " + employee1.getName() + ", with ID of " + employee1.getID() + ", with a salary of $" + df.format(employee1.getSalary()) + " has been added to the set.");
		
		set.add(employee2);
		System.out.println("Employee with name " + employee2.getName() + ", with ID of " + employee2.getID() + ", with a salary of $" + df.format(employee2.getSalary()) + " has been added to the set.");

		set.add(employee3);
		System.out.println("Employee with name " + employee3.getName() + ", with ID of " + employee3.getID() + ", with a salary of $" + df.format(employee3.getSalary()) + " has been added to the set.");

		set.add(employee4);
		System.out.println("Employee with name " + employee4.getName() + ", with ID of " + employee4.getID() + ", with a salary of $" + df.format(employee4.getSalary()) + " has been added to the set.");

		set.add(employee5);
		System.out.println("Employee with name " + employee5.getName() + ", with ID of " + employee5.getID() + ", with a salary of $" + df.format(employee5.getSalary()) + " has been added to the set.");
		
		System.out.println("Max Salary: $" + df.format(set.getMaximum()) + " Employee Name: " + set.getMaxEmployeeInfo()[0] + " Employee ID: " + set.getMaxEmployeeInfo()[1]);
		System.out.println("Min Salary: $" + df.format(set.getMinimum()) + " Employee Name: " + set.getMinEmployeeInfo()[0] + " Employee ID: " + set.getMinEmployeeInfo()[1]);
		System.out.println("Average Salary: $" + df.format(set.getAverage()));
	}
}
