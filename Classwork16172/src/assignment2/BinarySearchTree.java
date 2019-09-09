package assignment2;

//Mark Mozgovoy 4/5/17

public class BinarySearchTree {
	
	//main
	public static void main(String[] args){
		
		//create binary search tree and add nodes
		BinarySearchTree bTree = new BinarySearchTree();
		bTree.addNode(50);
		bTree.addNode(25);
		bTree.addNode(15);
		bTree.addNode(30);
		bTree.addNode(75);
		bTree.addNode(85);
		
		//print out the in order traversal of BST
		System.out.println("In Order Traversal: \n******************");
		bTree.inOrderTraverseTree(bTree.root);
		
		//find kth element of BST via in order traversal
		System.out.println("\nFirst Element in BST");
		bTree.inOrderFindElement(bTree.root, bTree.new Counter(1));
		System.out.println("\nSecond Element in BST");
		bTree.inOrderFindElement(bTree.root, bTree.new Counter(2));
		System.out.println("\nThird Element in BST");
		bTree.inOrderFindElement(bTree.root, bTree.new Counter(3));
		System.out.println("\nFourth Element in BST");
		bTree.inOrderFindElement(bTree.root, bTree.new Counter(4));
		System.out.println("\nFifth Element in BST");
		bTree.inOrderFindElement(bTree.root, bTree.new Counter(5));
		System.out.println("\nSixth Element in BST");
		bTree.inOrderFindElement(bTree.root, bTree.new Counter(6));
		
		//show case methods of adding the number of leaves and the average of the nodes' keys
		System.out.println("\nThis tree has " + inOrderAdd(bTree.root, bTree.new Counter(0)) + " leaves.");
		bTree.addNode(65);
		System.out.println("\nIn Order Traversal: \n******************");
		bTree.inOrderTraverseTree(bTree.root);
		System.out.println("\nAfter adding a node with key 65, this tree has " + inOrderAdd(bTree.root, bTree.new Counter(0)) + " leaves.");
		System.out.println("\nThe average of the tree is " + inOrderAverage(bTree.root, bTree.new Counter(0), bTree.new Counter(0)) + ".");
	}
	
	//instance variable of BinarySearchTree
	BinaryTreeNode root;
	
	//constructor for BST
	public BinarySearchTree(){
		this.root = null;
	}
	
	//specific constructor for BST
	public BinarySearchTree(BinaryTreeNode root){
		this.root = root;
	}
	
	//adding a node for BST
	public void addNode(int key){
		BinaryTreeNode newNode = new BinaryTreeNode(key);
		
		if(root == null){
			this.root = newNode;
		}
		else{
			BinaryTreeNode focusNode = root;
			BinaryTreeNode parent;
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
	
	//used for printing out nodes in order
	public void inOrderTraverseTree(BinaryTreeNode focusNode){
		if(focusNode != null){
			inOrderTraverseTree(focusNode.lChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rChild);
		}
	}
	
	//Subclass of BST, is a counter to be used inside of recursive functions
	public class Counter{
		
		//instance variables of Counter
		public double value;
		
		//constructor
		public Counter(double value){
			this.value = value;
		}
		
		//counts down
		public void countDown(){
			this.value--;
		}
		
		//counts up
		public void countUp(){
			this.value++;
		}
		
		//adds on the parameter, useful for sums
		public void countUp(int i){
			this.value += i;
		}
	}
	
	//returns the kth element of the BST
	public void inOrderFindElement(BinaryTreeNode focusNode, Counter c){
		if(focusNode != null){
			inOrderFindElement(focusNode.lChild, c);
			c.countDown();
			if(c.value == 0)
				System.out.println(focusNode);
			inOrderFindElement(focusNode.rChild, c);
		}
	}
	
	//adds the leaves (nodes with no children), using in order traversal
	public static double inOrderAdd(BinaryTreeNode focusNode, Counter c){
		if(focusNode != null){
			if(focusNode.lChild == null && focusNode.rChild == null){
				c.countUp();
			}
			inOrderAdd(focusNode.lChild, c);
			inOrderAdd(focusNode.rChild, c);
		}
		return c.value;
	}
	
	//uses in order traversal to add up all nodes' keys and then divides them by the amount of nodes - hence 2 counters
	public static double inOrderAverage(BinaryTreeNode focusNode, Counter sum, Counter amount){
		if(focusNode != null){
			sum.countUp(focusNode.key);
			amount.countUp();
			inOrderAverage(focusNode.lChild, sum, amount);
			inOrderAverage(focusNode.rChild, sum, amount);
		}
		return sum.value/amount.value;
	}
}