package lab4;

//Mark Mozgovoy 3/27/17

public class BinaryTree {
	/**
	 * DO NOT IMPLEMENT DELETION, IT'S COMPLICATED
	 **/
	
	//main
	public static void main(String[] args){
		
		//creating BST and adding nodes
		BinaryTree bTree = new BinaryTree();
		System.out.println("Now adding the following nodes: 50, 25, 15, 30, 75, 80 in that order to the BST.");
		bTree.addNode(50);
		bTree.addNode(25);
		bTree.addNode(15);
		bTree.addNode(30);
		bTree.addNode(75);
		bTree.addNode(85);
		
		//print out traversal results
		System.out.println("\nIn Order Traversal: \n******************");
		bTree.inOrderTraverseTree(bTree.root);
		System.out.println("\nPreorder Traversal: \n******************");
		bTree.preorderTraverseTree(bTree.root);
		System.out.println("\nPost Order Traversal: \n******************");
		bTree.postOrderTraverseTree(bTree.root);
		
		//demonstrate that search works
		System.out.println("\nFinding node with key 75");
		System.out.println(bTree.inOrderSearch(bTree.root, 75));
		System.out.println("\nFinding node with key 115");
		System.out.println(bTree.inOrderSearch(bTree.root, 115));
	}
	
	//searches the BST
	public String inOrderSearch(Node focusNode, int key){
		if(focusNode.key == key || focusNode == null){
			return "The node with the given key was found.";
		}
		else if(key < focusNode.key){
			if(focusNode.lChild != null)
				return inOrderSearch(focusNode.lChild, key);
			return "No node with such key found.";
		}
		else if(key > focusNode.key){
			if(focusNode.rChild != null)
				return inOrderSearch(focusNode.rChild, key);
			return "No node with such key found.";
		}
		return null;
		
	}

	//instance variable of BinaryTree
	Node root;
	
	//default constructor for a binary tree
	public BinaryTree(){
		this.root = null;
	}
	
	//specific constructor for BinaryTree
	public BinaryTree(Node root){
		this.root = root;
	}
	
	//adds the node to the BST depending on its value
	public void addNode(int key){
		Node newNode = new Node(key);
		
		if(root == null){
			this.root = newNode;
		}
		else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;
				if(key < focusNode.key){
					focusNode = focusNode.lChild;
					if(focusNode == null){
						parent.lChild = newNode;
						return;
					}
				}
				else{
					focusNode = focusNode.rChild;
					if(focusNode == null){
						parent.rChild = newNode;
						return;
					}
				}
			}
			
		}
	}
	
	//traversing the BST in order
	public void inOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			inOrderTraverseTree(focusNode.lChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rChild);
		}
	}
	
	//traversing the BST in preorder
	public void preorderTraverseTree(Node focusNode){
		if(focusNode != null){
			System.out.println(focusNode);
		}
		if(focusNode.lChild != null){
			preorderTraverseTree(focusNode.lChild);
		}
		if(focusNode.rChild != null){
			preorderTraverseTree(focusNode.rChild);
		}
	}
	
	//traversing BST post order
	public void postOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			postOrderTraverseTree(focusNode.lChild);
			postOrderTraverseTree(focusNode.rChild);
			System.out.println(focusNode);
		}
	}
	
	//subclass of BinaryTree
	class Node{
		
		//instance variables of Node
		Node lChild;
		Node rChild;
		int key;
		
		//default constructor for Node
		public Node(){
			this.lChild = null;
			this.rChild = null;
		}
		
		//specific constructor for Node
		public Node(int key){
			this.lChild = null;
			this.rChild = null;
			this.key = key;
		}
		
		//prints the key
		public String toString(){
			return "This node has the key " + this.key;
		}
	}
	
}

