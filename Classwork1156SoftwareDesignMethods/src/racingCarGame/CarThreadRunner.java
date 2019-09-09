package racingCarGame;

/**
 * 
 * @author Mark Mozgovoy 10/24/17
 *
 */

public class CarThreadRunner {
	public static void main(String[] args){
		Car car = new Car();
		final int REPETITIONS = 5;
		final int THREADS = 5;
		
		for(int i = 1; i <= THREADS; i++){
			AddGasRunnable addGas = new AddGasRunnable(car, REPETITIONS);
			DriveRunnable drive = new DriveRunnable(car, REPETITIONS);
			
			Thread agt = new Thread(addGas);
			Thread dt = new Thread(drive);
			
			agt.start();
			dt.start();
		}
	}
}
