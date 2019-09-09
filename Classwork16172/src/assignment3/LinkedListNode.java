package assignment3;

//Mark Mozgovoy 4/30/17

public class LinkedListNode {
	
	//instance variables
	int info;
	LinkedListNode next;
	
	//specific constructor for a linked list node
	public LinkedListNode(int info, LinkedListNode pointer){
		this.info = info;
		this.next = pointer;
	}
	
	//default constructor for a linked list node
	public LinkedListNode(){
		
	}
}
