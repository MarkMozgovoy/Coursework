package lab3;

//Mark Mozgovoy 3/22/17

public class LinkedListImplementation {//displays the info about the operations done on the train
	public static void main(String[] args){
		
		//declare train
		System.out.println("First, we will make the train.");
		Train train = new Train();
		train.displayTrain();
		
		//add train cars to empty train (front & back)
		System.out.println("\nSecond, we will add a few train cars.");
		train.addToFront(new TrainCar(50, "Passenger"));
		train.addToFront(new TrainCar(50, "Passenger"));
		train.addToFront(new TrainCar(2, "Driver's Cabin"));
		train.addToBack(new TrainCar(100, "Cargo"));
		train.addToBack(new TrainCar(100, "Cargo"));
		System.out.println("\nHere is the train now:");
		train.displayTrain();
		
		//add train cars to filled train (front & back)
		System.out.println("\nWe will add a Passenger Carriage to the front.");
		train.addToFront(new TrainCar(50, "Passenger"));
		System.out.println("We will add another Cargo Carriage to the back.");
		train.addToBack(new TrainCar(150, "Cargo"));
		System.out.println("\nHere is the train now:");
		train.displayTrain();
		
		//remove a train car from the front of the train
		System.out.println("\nNow the train cannot move! We will have to remove the first train car.");
		train.removeFromFront();
		System.out.println("\nHere is the train now: ");
		train.displayTrain();
		
		//search through the train looking for capacity
		System.out.println("\nSearching for the first instance of a train car with a capacity of 150.");
		train.searchTrain(150);
		System.out.println("\nSearching for the first instance of a train car with a capacity of 5.");
		train.searchTrain(5);
		
		//search through the train looking for type
		System.out.println("\nSearching for the first instance of a train car with a type of Passenger.");
		train.searchTrain("Passenger");
		System.out.println("\nSearching for the first instance of a train car with a type of Driver's Cabin.");
		train.searchTrain("Driver's Cabin");
		System.out.println("\nSearching for the first instance of a train car with a type of Cargo.");
		train.searchTrain("Cargo");
		System.out.println("\nSearching for the first instance of a train car with a type of Oil Tank.");
		train.searchTrain("Oil Tank");
		
		//display the passenger and cargo capacity of the train
		System.out.println("\nThe total capacity of passengers in this train is " + train.countCapacityPassengers() + ".");
		System.out.println("\nThe total capacity of cargo in this train is " + train.countCapacityCargo() + ".");
	}

}
