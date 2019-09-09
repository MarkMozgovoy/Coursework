package inClassQuiz;

public class DataSet {
	private double sum;
	private double maximum;
	private double minimum;
	private int count;
	
	public DataSet(){
		sum = 0;
		count = 0;
		maximum = 0;
		minimum = 0;
	}
	
	public void add(double x){
		sum = sum + x;
		if(count == 0 || maximum < x) maximum = x;
		if(count == 0 || minimum > x) minimum = x;
		count++;
	}
	
	public double getAverage(){
		if(count == 0) return 0;
		else return sum/count;
	}
	
	public double getMaximum(){
		return maximum;
	}
	
	public double getMinimum(){
		return minimum;
	}
}
