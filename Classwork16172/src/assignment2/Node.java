package assignment2;

//Mark Mozgovoy 4/5/17

public class Node {
	
	//instance variables
	int info;
	Node next;
	
	//specific constructor
	public Node(int info, Node pointer){
		this.info = info;
		this.next = pointer;
	}
	
	//default constructor
	public Node(){
		
	}
}

