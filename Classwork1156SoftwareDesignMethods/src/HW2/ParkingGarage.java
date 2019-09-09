package HW2;

public class ParkingGarage {
	private int capacity;
	private ParkingSpace[] garageSpaces;
	
	public ParkingGarage(int capacity){
		this.capacity = capacity;
		this.garageSpaces = new ParkingSpace[this.capacity];
		for(int i = 0; i < this.capacity; i++){
			this.garageSpaces[i] = new ParkingSpace();
		}
	}
	
	public void drawMap(int givenTime){
		System.out.println("The following is a map of the parking garage parking spaces at " + givenTime + ":00. A 0 represents a free spot at the selected time,\n"
				+ "a 1 represents a reserved spot at the selected time and a 2 represents an occupied space. The parking spots are numbered 0 - 19.");
		for(int i = 0; i < this.capacity; i++){
			int checkTime;
			boolean isReserved = false;
			for(checkTime = 0; checkTime < 24; checkTime++){
				if(this.garageSpaces[i].getReservationTimeSlot(checkTime) != 0){
					isReserved = true;
				}
			}
			
			if(this.garageSpaces[i].getReservationTimeSlot(givenTime) != 0){
				System.out.print(2 + " ");
			}
			else if(isReserved && this.garageSpaces[i].getReservationTimeSlot(givenTime) == 0){
				System.out.print(1 + " ");
			}
			else{
				System.out.print(0 + " ");
			}
			
		}
	}
	
	public ParkingSpace returnSpace(int space){
		return this.garageSpaces[space];
	}
}
