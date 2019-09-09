package assignment3;

//Mark Mozgovoy 4/30/17

public class BSTNode {
	
	BSTNode lChild;
	BSTNode rChild;
	int key;
	
	//default constructor for BSTNode
	public BSTNode(){
		this.lChild = null;
		this.rChild = null;
	}
	
	//specific constructor for BSTNode
	public BSTNode(int key){
		this.lChild = null;
		this.rChild = null;
		this.key = key;
	}
	
	//prints the key of the BSTNode
	public String toString(){
		return "This node has the key " + this.key;
	}
}
