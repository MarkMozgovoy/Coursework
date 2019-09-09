package assignment2;

//Mark Mozgovoy 4/5/17

public class LinkedListReversal {
	
	public static void main(String[] args){
		
		//create linked list and add a few nodes
		LinkedList list = new LinkedList();
		list.push(new Node(5, null));
		list.push(new Node(6, null));
		list.push(new Node(7, null));
		list.push(new Node(8, null));
		list.push(new Node(9, null));
		list.push(new Node(10, null));
		
		//print the linked list
		System.out.println("This is the starting Linked List: ");
		Node current = list.root;
		while(current != null){
			System.out.print(current.info + " ");
			current = current.next;
		}
		
		//reverse the list
		reverse(list);
		
		//print out the reversed list
		System.out.println("\nThis is the reversed Linked List: ");
		current = list.root;
		while(current != null){
			System.out.print(current.info + " ");
			current = current.next;
		}
	}
	
	//Assuming the linked list does not loop.
	//reverses the linked list
	public static void reverse(LinkedList list){
		//nodes to be used in switching the pointers
		Node currentNode = list.root;
		Node prevNode = null;
		Node nextNode;
		
		//while the node of which pointer we are switching exists, cycles through whole list
		while(currentNode != null){
			
			//the next node is always the one that is linked from the current node
			nextNode = currentNode.next;
			
			//change the current node's pointer to be the previous node, even if previous node is null
			currentNode.next = prevNode;
			
			//the current node is labeled as previous for use of next node's pointer change
			prevNode = currentNode;
			
			//if the next node is null, then we are at the new root of the list
			if(nextNode == null){
				list.root = currentNode;
			}
			
			//now loop
			currentNode = nextNode;
		}
		
	}
}
