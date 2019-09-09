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
public class CalculatorServer {
	public static void main(String[] args){
		try{
			ServerSocket sock = new ServerSocket(2017);
			while(true){
				Socket client = sock.accept();
				InputStream inStream = client.getInputStream();
		        Scanner in = new Scanner(inStream);
			    OutputStream outStream = client.getOutputStream(); 
			    
			    
			    double firstNum = in.nextDouble();
			    String operation = in.next();
			    double secondNum = in.nextDouble();
			    double finalAnswer = 0;
			    
			    if(operation.equals("+")){
			    	finalAnswer = firstNum + secondNum;
			    }
				if(operation.equals("-")){
					finalAnswer = firstNum - secondNum;
				}
				if(operation.equals("*")){
					finalAnswer = firstNum * secondNum;
				}
				if(operation.equals("/")){
					finalAnswer = firstNum / secondNum;
				}
				if(operation.equals("%")){
					finalAnswer = firstNum % secondNum;
				}
			    String answer = "The answer is " + finalAnswer;
		        
		        PrintWriter out = new PrintWriter(outStream);
		        // write the Date to the socket
			    
		        out.print(answer);
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