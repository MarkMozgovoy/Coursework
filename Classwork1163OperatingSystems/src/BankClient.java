import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @author Mark Mozgovoy 9/22/17
 *
 */
public class BankClient {
	public static void main(String[] args){
		try {
		     // this could be changed to an IP name or address other than the localhost
			Socket sock = new Socket("127.0.0.1", 2017);
			InputStream instream = sock.getInputStream();
			OutputStream outstream = sock.getOutputStream();
			Scanner in = new Scanner (instream);
			PrintWriter out = new PrintWriter(outstream);
			Scanner userOperationInput = new Scanner(System.in);
			System.out.println("Please enter the operation below.");
			String command = userOperationInput.nextLine();
			
			
			out.println(command);
			out.flush();
			while(in.hasNextLine())
			{
				String line = in.nextLine();
				System.out.println(line);
			}
				
			sock.close();
		}
		catch (IOException ioe) {
			System.err.println(ioe);
		}
	}
}
