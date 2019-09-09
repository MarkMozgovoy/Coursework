package lab3;

//Mark Mozgovoy 3/22/17

public class Train {
	
	//properties of a train
	TrainCar firstCar;
	TrainCar lastCar;
	
	//constructor of a linked list called train
	public Train(){
		this.firstCar = null;
		this.lastCar = null;
	}
	
	//displays every train car in a train
	public void displayTrain(){
		if(this.firstCar == null){//if the train is empty, do not iterate through it
			System.out.println("The train is empty.");
			return;
		}
		TrainCar current = this.firstCar;
		int counter = 0;
		while(current != null){//iterate through the car, counter only for display purposes
			counter++;
			System.out.print("Train Car " + counter + " is a " + current.type + " carriage with a capacity of " + current.capacity + ".\n");
			current = current.nextCar;
		}
	}
	
	//adds a train car to the front of the train
	public void addToFront(TrainCar newCar){
		TrainCar front = newCar;
		front.nextCar = this.firstCar;//link added car to the front car
		this.firstCar = front;//reassign the front car
		if(this.firstCar.nextCar == null){//if it is the only car, it is also the back car
			this.lastCar = this.firstCar;
		}
		System.out.println("Train Car with a type of " + newCar.type + " and a capacity of " + newCar.capacity + " has been added to the front.");
	}
	
	//adds a train car to the back of the train
	public void addToBack(TrainCar newCar){
		TrainCar oldLast = lastCar;
		lastCar = new TrainCar();
		lastCar = newCar;
		lastCar.nextCar = null;
		if(firstCar == null){//if it is the only car, it is also the front car
			firstCar = lastCar;
		}
		else{
			oldLast.nextCar = lastCar;//assign link from previous last to new last
		}
		System.out.println("Train Car with a type of " + newCar.type + " and a capacity of " + newCar.capacity + " has been added to the back.");

	}
	
	//removes a train car from the front
	public TrainCar removeFromFront(){
		if(firstCar != null){
			TrainCar car = firstCar;
			firstCar = firstCar.nextCar;//2nd car becomes first car
			System.out.println("First car removed. It was of type " + car.type + " and had a capacity of " + car.capacity + ".");
			return car;
		}
		else{//if the train is empty, removing will do no good
			System.out.println("No cars in the train!");
			return null;
		}
	}
	
	//searches through the train for a train car with the specified capacity
	public TrainCar searchTrain(int capacity){
		TrainCar current = this.firstCar;
		int counter = 0;
		while(current != null){//iterate through train and return the first car that has a matching capacity
			counter++;
			if(current.capacity == capacity){
				System.out.println("Train Car " + counter + " is the first train car in the train with a capacity of " + current.capacity + ".");
				return current;
			}
			current = current.nextCar;
		}
		System.out.println("There is no train car with the given parameter.");//if no car is found
		return null;
	}
	
	//searches through the train for a train car with the specified type
	public TrainCar searchTrain(String type){
		TrainCar current = this.firstCar;
		int counter = 0;
		while(current != null){//iterate through train and return the first car that has the matching type
			counter++;
			if(current.type == type){
				System.out.println("Train Car " + counter + " is the first train car in the train with a type of " + current.type + ".");
				return current;
			}
			current = current.nextCar;
		}
		System.out.println("There is no train car with the given parameter.");//if no car is found
		return null;
	}
	
	//returns the sum of the capacities of passengers of all train cars in the train
	public int countCapacityPassengers(){
		if(this.firstCar == null){//capacity is always 0 if there are no train cars
			return 0;
		}
		TrainCar current = this.firstCar;
		int total = 0;
		while(current != null){//add to total only if the type of train car has passengers
			if(current.type.equals("Passenger") || current.type.equals("Driver's Cabin")){
				total += current.capacity;
			}
			current = current.nextCar;
		}
		return total;
	}
	
	//returns the sum of the capacities of cargo of all train cars in the train
	public int countCapacityCargo(){
		if(this.firstCar == null){//capacity is always 0 if there are no train cars
			return 0;
		}
		TrainCar current = this.firstCar;
		int total = 0;
		while(current != null){//add to total only if the type of train car has cargo
			if(current.type.equals("Cargo")){
				total += current.capacity;
			}
			current = current.nextCar;
		}
		return total;
	}
	
}
