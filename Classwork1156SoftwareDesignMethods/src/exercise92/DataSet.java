package exercise92;

public class DataSet {
	private double sum;
	private Person maximum;
	private int count;
	
	public DataSet(){
		sum = 0;
		count = 0;
		maximum.setHeight(0);
	}
	
	public void add(double x){
		sum = sum + x;
		if(count == 0 || maximum.getHeight() < x) maximum.setHeight(x);
		count++;
	}
	
	public double getAverage(){
		if(count == 0) return 0;
		else return sum/count;
	}
	
	public double getMaximum(){
		return maximum.getHeight();
	}
}
