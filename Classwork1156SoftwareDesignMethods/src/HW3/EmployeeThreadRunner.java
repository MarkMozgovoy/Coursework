package HW3;
/**
 * 
 * @author Mark Mozgovoy 11/2/17
 *
 */
public class EmployeeThreadRunner {
	public static void main(String[] args){
		Employee employee = new Employee();
		final int REPETITIONS = 10;
		final int THREADS = 10;
		
		for(int i = 1; i <= THREADS; i++){
			raiseSalaryRunnable raiseSalary = new raiseSalaryRunnable(employee, REPETITIONS);
			reduceSalaryRunnable reduceSalary = new reduceSalaryRunnable(employee, REPETITIONS);
			
			Thread raiseSalaryThread = new Thread(raiseSalary);
			Thread reduceSalaryThread = new Thread(reduceSalary);
			
			reduceSalaryThread.start();
			raiseSalaryThread.start();
		}
	}
}
