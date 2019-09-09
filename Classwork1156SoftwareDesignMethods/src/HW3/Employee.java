package HW3;

import java.text.DecimalFormat;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @author Mark Mozgovoy 11/2/17
 *
 */
public class Employee {
	private double salary;
	private final double START_SALARY = 10.5;
	private final double MIN_SALARY = 15;
	private final double RAISE_SALARY_PERCENT = 5;
	private final double REDUCE_SALARY_PERCENT = 10;
	private Condition insufficientSalary;
	private Lock salaryReductionLock;
	DecimalFormat df = new DecimalFormat("0.##");
	
	public Employee(){
		this.salary = START_SALARY;
		this.salaryReductionLock = new ReentrantLock();
		this.insufficientSalary = salaryReductionLock.newCondition();
	}
	
	
	
	public void reduceSalary() throws InterruptedException{
		this.salaryReductionLock.lock();
		try{
			while(MIN_SALARY > this.salary - this.salary * REDUCE_SALARY_PERCENT / 100){
				this.insufficientSalary.await();
			}
			this.salary = this.salary - this.salary * REDUCE_SALARY_PERCENT / 100;
			System.out.println("Salary reduced by 10 percent! The new salary is $" + df.format(this.salary) + ".");
		}
		finally{
			this.salaryReductionLock.unlock();
		}
	}
	
	public void raiseSalary() throws InterruptedException{
		this.salaryReductionLock.lock();
		try{
			this.salary = this.salary + (this.salary * RAISE_SALARY_PERCENT / 100);
			System.out.println("Salary raised by 5 percent! The new salary is $" + df.format(this.salary) + ".");
			if(this.salary - this.salary * REDUCE_SALARY_PERCENT / 100 >= MIN_SALARY){
				this.insufficientSalary.signalAll();
			}
		}
		finally{
			this.salaryReductionLock.unlock();
		}
	}
	
	public double getSalary(){
		return this.salary;
	}
}
