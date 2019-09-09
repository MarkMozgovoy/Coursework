import java.net.*;
import java.io.*;
import java.util.*;

/**
 * 
 * @author Mark Mozgovoy 9/19/17
 *
 */
public class TestClient
{
	public static void main(String[] args)  {
	   try {
	     // this could be changed to an IP name or address other than the localhost
			Socket sock = new Socket("127.0.0.1",6013);
			InputStream instream = sock.getInputStream();
			OutputStream outstream = sock.getOutputStream();
			Scanner in = new Scanner (instream);
			PrintWriter out = new PrintWriter(outstream);
			Scanner userNameInput = new Scanner(System.in);
			
			String command = userNameInput.nextLine();
			out.println(command);
			out.flush();
			while( in.hasNextLine())
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
