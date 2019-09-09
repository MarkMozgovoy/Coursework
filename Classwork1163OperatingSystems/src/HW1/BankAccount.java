package HW1;
/**
 * 
 * @author Mark Mozgovoy 10/1/17
 *
 */
public class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) throws IllegalArgumentException{
		if(initialBalance < 0){
			throw new IllegalArgumentException("You entered a negative number!");
		}
		else{
			this.balance = initialBalance;
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
}

