import java.util.Scanner;

/**
 * 
 * @author Mark Mozgovoy 9/29/17
 *
 */

public class BankAccount {
	private double balance;
	private String ownerName;
	
	public BankAccount(double initialBalance, String n) throws IllegalArgumentException{
		if(initialBalance < 0){
			throw new IllegalArgumentException("You entered a negative number!");
		}
		else{
			this.balance = initialBalance;
			this.ownerName = n;
		}
	}
	
	public void deposit(double amount){
		if(amount < 0){
			throw new IllegalArgumentException("You entered a negative number!");
		}
		else{
			balance += amount;
		}
	}
	
	public void withdraw(double amount){
		if(amount < 0 || this.getBalance()-amount < 0){
			throw new IllegalArgumentException("You entered a negative number!");
		}
		else{
			balance -= amount;
		}
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public String getName(){
		return this.ownerName;
	}
	
	
}
