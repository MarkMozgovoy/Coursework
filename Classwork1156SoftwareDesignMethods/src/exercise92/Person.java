package exercise92;

public class Person {
	private String name;
	private double height;
	
	public Person(String name, double height){
		this.name = name;
		this.height = height;
	}
	
	public String getName(){
		return this.name;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public static void main(String[] args){
		DataSet heightSet = new DataSet();
		heightSet.add(200);
		heightSet.add(185);
		heightSet.add(190);
		heightSet.add(170);
		heightSet.add(163);
		heightSet.add(150);
		heightSet.add(198);
		heightSet.add(203);
		heightSet.add(169);
		heightSet.add(179);
		heightSet.add(187);
		heightSet.add(188);
		
		System.out.println("The max height is " + heightSet.getMaximum() + ".");
	}
}
