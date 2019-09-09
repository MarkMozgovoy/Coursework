package HW2;
/**
 * @author Jing Huang & Mark Mozgovoy
 */
import java.util.Scanner;
public class ParkingReservation {
	public static boolean sanitizeInput(int start, int end, int input){
		if(input >= start && input <= end){
			return true;
		}else{
			System.out.println("Bad input!");
			return false;
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ParkingGarage garage = new ParkingGarage(20);		
		int rTime = 0; 
		int rSpace = 0;
		
		int option = 0;
		boolean a = true;
		String name = "";
		
	while(a){
		System.out.println("Please enter the current time:");
		int currentTime = in.nextInt();
		garage.drawMap(currentTime);
		System.out.println("\nParking menu:\n");
		System.out.println("Type 1 to enter a different time.");
		System.out.println("Type 2 to reserve a space for an hour.");
		System.out.println("Type 3 to delete a reservation.");
		System.out.println("Type 4 to extend time for a given reservation.");
		System.out.println("Type 5 to view a reservation.");
		System.out.println("Type 6 to exit.");
		System.out.println("");
		
		System.out.println("Please enter your choice:");
		option = in.nextInt();
		
	    if(option == 1)
	    {
	    	//restarts while loop.
		}
    
	    if(option == 2)
	    {					
		    System.out.println("Enter a number of the parking space. (0-19)");
		    rSpace = in.nextInt();	
		    if(!sanitizeInput(0, 19, rSpace)){
		    	continue;
		    }
			System.out.println("Enter the time (0-23)");
			rTime = in.nextInt();
			if(!sanitizeInput(0, 23, rTime)){
		    	continue;
		    }
			System.out.println("Enter your first name:");
			name = in.next();
			System.out.println("Enter your last name:");
			name += " " + in.next();
			if(garage.returnSpace(rSpace).getReservationTimeSlot(rTime) != 1){
				if(rTime >= currentTime){
					garage.returnSpace(rSpace).reserveSlot(rTime, name);
					System.out.println(name + " reserved spot #" + rSpace + " for " + rTime + ":00.");
					System.out.println("");
				}
				else{
					System.out.println("ERROR! It is too late to make that reservation!");
				}
			}
			else{
				System.out.println("ERROR! This space is already reserved!");
			}
	    }
	
		if(option == 3)
		{
			System.out.println("Enter a number of the parking space. (0-19)");
		    rSpace = in.nextInt();	
		    if(!sanitizeInput(0, 19, rSpace)){
		    	continue;
		    }
		    System.out.println("At what time was the reservation which you would like to delete?\n" + 
					"WARNING! The reservation will be deleted from the given time onwards.");
			rTime = in.nextInt();
			if(!sanitizeInput(0, 23, rTime)){
		    	continue;
		    }
			name = garage.returnSpace(rSpace).getReservationName(rTime);
			if(garage.returnSpace(rSpace).getReservationTimeSlot(rTime) == 1){
				if(rTime > currentTime){
					System.out.println("Deleting the reservation for space #" + rSpace + ", at " + rTime + ":00, reserved by " + name + ".");
					garage.returnSpace(rSpace).unreserveSlot(rTime, name);
				}
				else{
					System.out.println("ERROR! It is too late to delete that reservation!");
				}
			}
			else{
				System.out.println("ERROR! You tried to delete a non-existent reservation!");
			}
		}
		
		if(option == 4){
			System.out.println("Enter a number of the parking space. (0-19)");
		    rSpace = in.nextInt();
		    if(!sanitizeInput(0, 19, rSpace)){
		    	continue;
		    }
		    System.out.println("At what time is the reservation which you would like to extend?");
			rTime = in.nextInt();
			if(!sanitizeInput(0, 23, rTime)){
		    	continue;
		    }
			System.out.println("By how many hours would you like to extend the given reservation?");
			int moreHours = in.nextInt();
			name = garage.returnSpace(rSpace).getReservationName(rTime);
			boolean canExtend = true;
			int hoursLeft = moreHours;//check to make sure you can extend the reservation.
			int i = rTime + 1;
			while(hoursLeft > 0){
				if(garage.returnSpace(rSpace).getReservationTimeSlot(i) == 1 && !garage.returnSpace(rSpace).getReservationName(i).equals(name)){
					canExtend = false;
				}
				if(23 < hoursLeft + rTime){
					canExtend = false;
					break;
				}
				if(0 > hoursLeft){
					canExtend = false;
					break;
				}
				hoursLeft--;
			}
			boolean isOver = false;//check if the reservation is over.
			for(int j = rTime; j <= currentTime; j++){
				if(garage.returnSpace(rSpace).getReservationName(j).equals(null) || !garage.returnSpace(rSpace).getReservationName(j).equals(name)){
					isOver = true;
				}
			}
			if(garage.returnSpace(rSpace).getReservationTimeSlot(rTime) == 1){
				if(canExtend == true){
					if(!isOver){
						garage.returnSpace(rSpace).extendReservation(rTime, name, moreHours);
						System.out.println("Extending time for slot # " + rSpace + ", at " + rTime + ":00, by " + moreHours + " hours.");	
					}
					else{
						System.out.println("It is too late to extend that reservation!");
					}
				}
				else{
					System.out.println("ERROR! Cannot extend reservation due to conflicting time slots or improper input!");
				}
				
			}
			else{
				System.out.println("ERROR! Cannot extend time for a non-existent reservation!");
			}
		}
		
		if(option == 5){
			System.out.println("Enter a number of the parking space. (0-19)");
		    rSpace = in.nextInt();	
		    if(!sanitizeInput(0, 19, rSpace)){
		    	continue;
		    }
		    System.out.println("At what time is the reservation which you would like to view?");
			rTime = in.nextInt();
			if(!sanitizeInput(0, 23, rTime)){
		    	continue;
		    }
			name = garage.returnSpace(rSpace).getReservationName(rTime);
			if(garage.returnSpace(rSpace).getReservationTimeSlot(rTime) == 1){
				System.out.println("This reservation is for spot # " + rSpace + ", reserved at " + rTime + ":00, belonging to " + name + " and lasts " + garage.returnSpace(rSpace).reservationInformation(rTime, name) + " hours.");
			}
			else{
				System.out.println("ERROR! There are no reservetations at the given spot at the given time!");
			}
		}
		if(option == 6)
		{
			a = false;
			System.out.println("Thank you for using the reservation system. See you next time.");
			in.close();
		}
	}
}
}