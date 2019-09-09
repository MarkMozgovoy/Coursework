package HW3;
/**
 * 
 * @author Mark Mozgovoy 11/2/17
 *
 */
public class raiseSalaryRunnable implements Runnable {
	private static final int DELAY = 1;
	private Employee employee;
	private int count;
	
	public raiseSalaryRunnable(Employee employee, int aCount){
		this.employee = employee;
		count = aCount;
	}
	
	public void run(){
		try{
			for(int i = 1; i <= count; i++){
				employee.raiseSalary();
				Thread.sleep(DELAY);
			}
		}
		catch(InterruptedException exception){
			
		}
	}
}
