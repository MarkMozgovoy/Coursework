package assignment3;

//Mark Mozgovoy 4/30/17

public class BinarySearchTree {
	BSTNode root;
	
	//constructor for BST
	public BinarySearchTree(){
		this.root = null;
	}
	
	//specific constructor for BST
	public BinarySearchTree(BSTNode root){
		this.root = root;
	}
	
	//adds a BST node to a BST
	public void addNode(int key){
		BSTNode newNode = new BSTNode(key);
		
		if(root == null){
			this.root = newNode;
		}
		else{
			BSTNode focusNode = root;
			BSTNode parent;
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
	
	//traverses a BST in order and prints out each node in order
	public void inOrderTraverseTree(BSTNode focusNode){
		if(focusNode != null){
			inOrderTraverseTree(focusNode.lChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rChild);
		}
	}
}
