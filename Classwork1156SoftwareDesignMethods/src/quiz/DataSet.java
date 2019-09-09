package quiz;
/**
 * 
 * @author Mark Mozgovoy 10/17/2017
 *
 */
public class DataSet {//fixed since quiz
	private double sum;
	private Measurable maximum;
	private Measurable minimum;
	private int count;
	
	public DataSet(){
		sum = 0;
		count = 0;
	}
	
	public void add(Measurable x){
		sum = sum + x.getSalary();
		if(count == 0 || maximum.getSalary() < x.getSalary()) maximum = x;
		if(count == 0 || minimum.getSalary() > x.getSalary()) minimum = x;
		count++;
	}
	
	public double getAverage(){
		if(count == 0) return 0;
		else return sum/count;
	}
	
	public double getMaximum(){
		return maximum.getSalary();
	}
	
	public double getMinimum(){
		return minimum.getSalary();
	}

	public String[] getMaxEmployeeInfo(){
		String name = this.maximum.getName();
		String id = this.maximum.getID();
		String[] returnArray = {name , id};
		return returnArray;
	}
	
	public String[] getMinEmployeeInfo(){
		String name = this.minimum.getName();
		String id = this.minimum.getID();
		String[] returnArray = {name , id};
		return returnArray;
	}
}
