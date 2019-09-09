import java.net.*;
import java.util.Scanner;
import java.io.*;

/**
 * 
 * @author Mark Mozgovoy 9/19/17
 *
 */

public class TestServer
{
    public static void main(String[] args)  {
        try {
	  ServerSocket sock = new ServerSocket(6013);
	  // now listen for connections
	  while (true) {
	     Socket client = sock.accept();
	     // we have a connection
	     InputStream inStream = client.getInputStream();
         Scanner in = new Scanner(inStream);
	     OutputStream outStream = client.getOutputStream(); 
	     String request = "Hello, ";
         request += in.nextLine();
        PrintWriter out = new PrintWriter(outStream);
        // write the Date to the socket
	    out.print(request);
	    out.flush();
        // close the socket and resume listening for more connections
	    client.close();
			}
		}
		catch (IOException ioe) {
				System.err.println(ioe);
		}
	}
}
