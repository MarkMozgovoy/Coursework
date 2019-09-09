package threads;
/**
 * 
 * @author Mark Mozgovoy 10/20/17
 *
 */
public class WithdrawRunnable implements Runnable {
	private static final int DELAY = 1;
	private BankAccount account;
	private double amount;
	private int count;
	
	public WithdrawRunnable(BankAccount anAccount, double anAmount, int aCount){
		account = anAccount;
		amount = anAmount;
		count = aCount;
	}
	
	public void run(){
		try{
			for(int i = 1; i <= count; i++){
				account.withdraw(amount);
				Thread.sleep(DELAY);
			}
		}
		catch(InterruptedException exception){
			
		}
	}
}
