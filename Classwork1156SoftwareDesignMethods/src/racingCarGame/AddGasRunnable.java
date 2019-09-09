package racingCarGame;
/**
 * 
 * @author Mark Mozgovoy 10/24/17
 *
 */
public class AddGasRunnable implements Runnable {
	private static final int DELAY = 1;
	private Car car;
	private int count;
	
	public AddGasRunnable(Car car, int aCount){
		this.car = car;
		count = aCount;
	}
	
	public void run(){
		try{
			for(int i = 1; i <= count; i++){
				car.addGas();
				Thread.sleep(DELAY);
			}
		}
		catch(InterruptedException exception){
			
		}
	}
}
