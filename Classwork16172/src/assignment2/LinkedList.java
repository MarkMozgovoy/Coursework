package assignment2;

//Mark Mozgovoy 4/5/17

public class LinkedList {

	//instance variables
	Node root;
	
	//constructor
	public LinkedList(){
		this.root = null;
	}
	
	//pushes data onto the linked list
	void push(Node item){
		Node t = new Node();
		t.info = item.info;
		t.next = root;
		root = t;
	}
	
	//shows the top node
	Node peek(){
		if(root != null){
			return root;
		}
		else{
			System.out.println("Cannot peek empty linked list.");
			return null;
		}
	}
	
}
