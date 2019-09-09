package racingCarGame;
/**
 * @author Mark Mozgovoy 10/24/17
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car {
	private double gas;
	private final double MAX_GAS = 20;
	private final double EFFICIENCY = 50;
	private final double MIN_GAS = 100 / EFFICIENCY;
	private Condition sufficientGas;
	private Condition notTooMuchGas;
	private Lock driveLock;
	
	public Car(){
		this.gas = 0;
		driveLock = new ReentrantLock();
		sufficientGas = driveLock.newCondition();
		notTooMuchGas = driveLock.newCondition();
	}
	
	public void drive() throws InterruptedException{
		driveLock.lock();
		try{
			while(0 > this.gas - MIN_GAS){//no gas
				sufficientGas.await();
			}
			this.gas = this.gas - 100 / EFFICIENCY;
			System.out.println("Driving 100 miles. There are now " + this.gas + " gallons of gas in the car.");
			if(this.gas + 5 <= MAX_GAS){
				notTooMuchGas.signalAll();
			}
		}
		finally{
			driveLock.unlock();
		}
	}
	
	public void addGas() throws InterruptedException{
		driveLock.lock();
		try{
			while(this.gas + 5 > MAX_GAS){
				notTooMuchGas.await();
			}
			this.gas = this.gas + 5;
			System.out.println("Adding 5 gallons of gas to the car. There are now " + this.gas + " gallons of gas in the car.");
			sufficientGas.signalAll();
		}
		finally{
			driveLock.unlock();
		}
	}
	
	public double getGas(){
		return this.gas;
	}
}
