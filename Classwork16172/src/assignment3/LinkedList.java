package assignment3;

//Mark Mozgovoy 4/30/17

public class LinkedList {
	
	//instance variables
	LinkedListNode root;
		
	//constructor
	public LinkedList(){
		this.root = null;
	}
		
	//pushes data onto the top of the linked list
	void push(LinkedListNode item){
		LinkedListNode t = new LinkedListNode();
		t.info = item.info;
		t.next = root;
		root = t;
	}
		
	//shows the head of the linked list
	LinkedListNode peek(){
		if(root != null){
			return root;
		}
		else{
			System.out.println("Cannot peek empty linked list.");
			return null;
		}
	}
}
