package HW2;

public class ParkingSpace {
	
	private int[] reservationTimeSlot;
	private String[] reservationName;
	
	public ParkingSpace(){
		reservationTimeSlot = new int[24];
		reservationName = new String[24];
		for(int i = 0; i < 24; i++){
			reservationTimeSlot[i] = 0;
			reservationName[i] = "";
		}
		
	}

	public int getReservationTimeSlot(int time) {
		return this.reservationTimeSlot[time];
	}


	public String getReservationName(int time) {
		return this.reservationName[time];
	}

	public void reserveSlot(int timeSlot, String name){
		this.reservationTimeSlot[timeSlot] = 1;
		this.reservationName[timeSlot] = name;
	}
	
	public void unreserveSlot(int timeSlot, String name){
		while(this.reservationName[timeSlot].equals(name)){
			this.reservationTimeSlot[timeSlot] = 0;
			this.reservationName[timeSlot] = "";
			timeSlot++;
		}
	}
	
	public void extendReservation(int timeSlot, String name, int extendedTime){
		while(!this.getReservationName(timeSlot+1).equals(null) && this.getReservationName(timeSlot).equals(this.getReservationName(timeSlot+1))){
			timeSlot++;
		}
		int moreHours = extendedTime;
		int i = timeSlot + 1;
		while(moreHours > 0){		
			this.reserveSlot(i, name);
			moreHours--;
			i++;
		}
	}
	
	public int reservationInformation(int timeSlot, String name){
		int howLong = 1;
		while(!this.getReservationName(timeSlot+1).equals(null) && this.getReservationName(timeSlot).equals(this.getReservationName(timeSlot+1))){
			timeSlot++;
			howLong++;
		}
		return howLong;
	}
}
