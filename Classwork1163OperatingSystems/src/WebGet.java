import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @author Mark Mozgovoy 9/19/17
 *
 */

public class WebGet {
	public static void main(String[] args) throws IOException{
		String host;
		String resource;
		if(args.length == 2){
			host = args[0];
			resource = args[1];
		}
		else{
			System.out.println("Getting / from horstmann.com");
			host = "horstmann.com";
			resource = "/";
		}
		
		final int HTTP_PORT = 80;
		Socket s = new Socket(host, HTTP_PORT);
		
		InputStream instream = s.getInputStream();
		OutputStream outstream = s.getOutputStream();
		
		Scanner in = new Scanner(instream);
		PrintWriter out = new PrintWriter(outstream);
		
		String command = "GET " + resource + " HTTP/1.1\n" + "Host: " + host + "\n\n";
		out.print(command);
		out.flush();
		
		while(in.hasNextLine()){
			String input = in.nextLine();
			System.out.println(input);
		}
		
		s.close();
	}
}
