package HW1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @author Mark Mozgovoy 10/1/17
 *
 */
public class BankAccountServer {
	public static void main(String[] args){
		try{
			ServerSocket sock = new ServerSocket(2017);
			BankAccount[] accountArray = new BankAccount[11];
			accountArray[0] = null;
			accountArray[1] = new BankAccount(0);
			accountArray[2] = new BankAccount(0);
			accountArray[3] = new BankAccount(0);
			accountArray[4] = new BankAccount(0);
			accountArray[5] = new BankAccount(0);
			accountArray[6] = new BankAccount(0);
			accountArray[7] = new BankAccount(0);
			accountArray[8] = new BankAccount(0);
			accountArray[9] = new BankAccount(0);
			accountArray[10] = new BankAccount(0);
			while(true){
				Socket client = sock.accept();
				InputStream inStream = client.getInputStream();
		        Scanner in = new Scanner(inStream);
			    OutputStream outStream = client.getOutputStream(); 
			    
			    
			    String[] clientInput = in.nextLine().split(" ");
			    String command = clientInput[0];
			    String bankAccountNumber = clientInput[1];
			    int bankAccount = Integer.parseInt(bankAccountNumber);
			    double amountValue = 0;
			    if(clientInput.length == 3){
			    	String amount = clientInput[2];
			    	amountValue = Double.parseDouble(amount);
			    }
			    
			    
			    String returnString = "";
			    
			    
			    if(command.equalsIgnoreCase("exit")){
			    	client.close();
			    	break;
			    }
			    
			    if(command.equalsIgnoreCase("Deposit")){
			    	accountArray[bankAccount].deposit(amountValue);
			    	returnString = "$" + amountValue + " has been deposited to account #" + bankAccount + ".\n"
			    			+ "Account #" + bankAccount + " has $" + accountArray[bankAccount].getBalance() + ".";
			    }
				if(command.equalsIgnoreCase("Withdraw")){
					accountArray[bankAccount].withdraw(amountValue);
			    	returnString = "$" + amountValue + " has been withdrawn from account #" + bankAccount + ".\n"
			    			+ "Account #" + bankAccount + " has $" + accountArray[bankAccount].getBalance() + ".";
				}
				if(command.equalsIgnoreCase("Balance")){
					returnString = "Bank account #" + bankAccount + " has $" + accountArray[bankAccount].getBalance() + ".";
				}
			    
				//String answer = "Bank account operation complete.";
		        
		        PrintWriter out = new PrintWriter(outStream);
		        // write the Date to the socket
			    
		        out.print(returnString);
			    out.flush();
		        // close the socket and resume listening for more connections
			    client.close();
			}
		}
		catch(IOException ioe){
			System.err.println(ioe);
		}
	}
}
