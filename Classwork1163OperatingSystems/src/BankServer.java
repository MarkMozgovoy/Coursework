import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @author Mark Mozgovoy 9/22/17
 *
 */
public class BankServer {
	public static void main(String[] args){
		try{
			ServerSocket sock = new ServerSocket(2017);
			BankAccount account1 = new BankAccount();
			while(true){
				Socket client = sock.accept();
				InputStream inStream = client.getInputStream();
		        Scanner in = new Scanner(inStream);
			    OutputStream outStream = client.getOutputStream(); 
			    
			    
			    String[] clientInput = in.nextLine().split(" ");
			    String command = clientInput[0];
			    
			    double amount = 0;
			    String returnString = "";
			    
			    if(clientInput.length > 1){
			    	amount = Integer.parseInt(clientInput[1]);
			    }
			    
			    
			    if(command.equalsIgnoreCase("Deposit")){
			    	account1.deposit(amount);
			    	returnString = amount + " dollars have been deposited to the account.";
			    }
				if(command.equalsIgnoreCase("Withdraw")){
					account1.withdraw(amount);
					returnString = amount + " dollars have been withdrawn from the account.";
				}
				if(command.equalsIgnoreCase("Balance")){
					returnString = "You have " + account1.getBalance() + " dollars in your bank account";
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