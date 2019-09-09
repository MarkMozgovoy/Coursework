import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @author Mark Mozgovoy 9/29/17
 *
 */
public class Exercise2Server {
	public static void main(String[] args){
		try{
			ServerSocket sock = new ServerSocket(2017);
			Car car1 = new Car(50);//fuel efficiency is in miles/gallon
			Car car2 = new Car(50);
			Car car3 = new Car(50);
			Car car4 = new Car(50);
			Car car5 = new Car(50);
			Car[] carArray = new Car[6];
			carArray[1] = car1;
			carArray[2] = car2;
			carArray[3] = car3;
			carArray[4] = car4;
			carArray[5] = car5;
			String returnString = "";
			while(true){
				Socket client = sock.accept();
				InputStream inStream = client.getInputStream();
		        Scanner in = new Scanner(inStream);
			    OutputStream outStream = client.getOutputStream();
			    String[] clientInput = in.nextLine().split(" ");
			    
			    if(clientInput[0].equalsIgnoreCase("Add")){
			    	int carNumber = Integer.parseInt(clientInput[2]);
			    	int gas = Integer.parseInt(clientInput[3]);
			    	carArray[carNumber].addGas(gas);
			    	returnString = "You added " + gas + " gallons of gas to car #" + carNumber + "!";
			    }
			    if(clientInput[0].equalsIgnoreCase("Drive")){
			    	int carNumber = Integer.parseInt(clientInput[1]);
			    	int miles = Integer.parseInt(clientInput[2]);
			    	carArray[carNumber].drive(miles);
			    	returnString = "You drove " + miles + " miles with car #" + carNumber + "!";
			    }
			    if(clientInput[0].equalsIgnoreCase("Get")){
			    	int carNumber = Integer.parseInt(clientInput[2]);
			    	returnString = "Car #" + carNumber + " has " + carArray[carNumber].getGas() + " gallons of gas left!";
			    }
			    
			    
			    PrintWriter out = new PrintWriter(outStream);
			    out.print(returnString);
			    out.flush();
			    client.close();
			}
		}catch(IOException ioe){
			System.err.println(ioe);
		}
	}
}
