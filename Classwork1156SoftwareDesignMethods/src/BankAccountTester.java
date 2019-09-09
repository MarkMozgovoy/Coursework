import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * 
 * @author Mark Mozgovoy
 *
 */

public class BankAccountTester {
	
	public static void main(String[] args){
		DecimalFormat df = new DecimalFormat("#.00");
		
		//Created 4 bank accounts
		BankAccount account1 = new BankAccount(1500, "Mark");
		BankAccount account2 = new BankAccount(500, "Jeff");
		BankAccount account3 = new BankAccount(350, "Chad");
		BankAccount account4 = new BankAccount(0, "Kevin");
		account1.deposit(500.01);
		account2.withdraw(1.55);
		account3.deposit(5.48);
		account4.withdraw(10.53);
		
		//added 4 accounts into the ArrayList
		ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
		bankAccounts.add(account1);
		bankAccounts.add(account2);
		bankAccounts.add(account3);
		bankAccounts.add(account4);
		System.out.println("There are " + bankAccounts.size() + " accounts in the ArrayList. They are: ");
		for(int i = 0; i < bankAccounts.size(); i++){
			if(bankAccounts.get(i).getBalance() > 0)
				System.out.println(bankAccounts.get(i).getName() + ": $" + df.format(bankAccounts.get(i).getBalance()));
			else{
				System.out.println(bankAccounts.get(i).getName() + ": -$" + df.format(-1 * bankAccounts.get(i).getBalance()));
			}
		}
		System.out.println();
		
		//traverse ArrayList and output name of the owner of largest bank account
		double maxBalance = bankAccounts.get(0).getBalance();
		String ownerOfBiggestAccount = bankAccounts.get(0).getName();
		for(int i = 0; i < bankAccounts.size(); i++){
			if(maxBalance < bankAccounts.get(i).getBalance()){
				maxBalance = bankAccounts.get(i).getBalance();
				ownerOfBiggestAccount = bankAccounts.get(i).getName();
			}
		}
		System.out.println("The owner of the biggest bank account is " + ownerOfBiggestAccount + ".");
	}
}
