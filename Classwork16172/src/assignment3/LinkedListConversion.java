package assignment3;

//Mark Mozgovoy 4/30/17

public class LinkedListConversion {
	
	public static void main(String[] args){
		
		//create a linked list and add nodes
		LinkedList list = new LinkedList();
		list.push(new LinkedListNode(15, null));
		list.push(new LinkedListNode(11, null));
		list.push(new LinkedListNode(9, null));
		list.push(new LinkedListNode(5, null));
		list.push(new LinkedListNode(3, null));
		list.push(new LinkedListNode(150, null));
		list.push(new LinkedListNode(19, null));
		list.push(new LinkedListNode(24, null));
		list.push(new LinkedListNode(92, null));
		list.push(new LinkedListNode(64, null));
		
		//print the original linked list
		System.out.println("Here is the original linked list: ");
		printList(list);
		
		//print size of the linked list
		System.out.println("\nThis is the size of the linked list: " + getSizeOfList(list));
		
		//convert the linked list to BST using a function and print it out in order
		System.out.println("\nWe will now add each node from the linked list into the BST: ");
		System.out.println("\nThis is the BST printed out in order: ");
		BinarySearchTree bst = new BinarySearchTree();
		convertListToBST(list, bst);
		bst.inOrderTraverseTree(bst.root);
		
	}
	
	//prints out a linked list
	public static void printList(LinkedList list) {
		
		//iterate through linked list and print out each node
		LinkedListNode currentNode = list.root;
		while(currentNode != null){
			System.out.print(currentNode.info + " ");
			currentNode = currentNode.next;
		}
	}
	
	//THIS IS PART OF THE ANSWER FOR QUESTION 2 OF ASSIGNMENT 3
	//returns the size of a linked list, assuming it is not circular
	public static int getSizeOfList(LinkedList list){
		
		//iterate through the whole linked list and add 1 to size variable for each node
		LinkedListNode currentNode = list.root;
		int size = 0;
		while(currentNode != null){
			size++;
			currentNode = currentNode.next;
		}
		return size;
	}
	
	//THIS IS PART OF THE ANSWER FOR QUESTION 2 OF ASSIGNMENT 3
	//converts a linked list into a BST
	public static void convertListToBST(LinkedList list, BinarySearchTree bst){
		
		//iterate through linked list and add each linked list node as a BSTNode into the BST
		LinkedListNode currentNode = list.root;
		while(currentNode != null){
			bst.addNode(currentNode.info);
			currentNode = currentNode.next;
		}
	}
}
