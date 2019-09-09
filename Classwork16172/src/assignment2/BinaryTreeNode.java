package assignment2;

//Mark Mozgovoy 4/5/17

public class BinaryTreeNode {
	
	//instance variables of Node
	BinaryTreeNode lChild;
	BinaryTreeNode rChild;
	int key;
	
	//default constructor for Node
	public BinaryTreeNode(){
		this.lChild = null;
		this.rChild = null;
	}
			
	//specific constructor for Node
	public BinaryTreeNode(int key){
		this.lChild = null;
		this.rChild = null;
		this.key = key;
	}
			
	//prints the key
	public String toString(){
		return "This node has the key " + this.key;
	}
}
