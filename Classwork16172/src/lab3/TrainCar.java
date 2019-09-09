package lab3;

//Mark Mozgovoy 3/22/17

public class TrainCar {//functions as a node in a linked list
	
	//properties of a train car
	int capacity;
	String type;
	
	//this is the link to the next train car
	TrainCar nextCar;
	
	//constructor
	public TrainCar(int capacity, String type){
		this.capacity = capacity;
		this.type = type;
		this.nextCar = null;
	}
	
	//default constructor (just in case)
	public TrainCar(){
		this.capacity = 0;
		this.type = "";
		this.nextCar = null;
	}
}
