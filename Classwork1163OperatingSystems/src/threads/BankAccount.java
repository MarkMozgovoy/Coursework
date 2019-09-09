package threads;
/**
 * 
 * @author Mark Mozgovoy 10/20/17
 *
 */
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	private double balance;
	private Lock balanceChangeLock;
	
	public BankAccount(){
		balance = 0;
		balanceChangeLock = new ReentrantLock();
	}
	
	public void deposit(double amount){
		balanceChangeLock.lock();
		try{
			System.out.print("Depositing " + amount);
			double newBalance = balance + amount;
			System.out.println(", new balance is " + newBalance);
			balance = newBalance;
		}
		finally{
			balanceChangeLock.unlock();
		}
	}
	
	public void withdraw(double amount){
		balanceChangeLock.lock();
		try{
			System.out.print("Withdrawing " + amount);
			double newBalance = balance - amount;
			System.out.println(", new balance is " + newBalance);
			balance = newBalance;
		}
		finally{
			balanceChangeLock.unlock();
		}
	}
	
	public double getBalance(){
		balanceChangeLock.lock();
		try{
			return balance;	
		}
		finally{
			balanceChangeLock.unlock();
		}
	}
}
