package march;

//Mark Mozgovoy 3/20/17

import java.lang.reflect.Array;

public class LinkedLists {
	public static Node createLinkedList(int[] a){
		Node head = new Node();
		Node tail = new Node();
		head.info = a[a.length - 1];
		head.pointer = null;
		tail = head;
		for(int i = a.length-2; i >= 0; i--){
			Node n = new Node();
			n.info = a[i];
			head.pointer = n;
			tail = n;
		}
		return head;
	}
	
	public static void main(String[] args){
		int[] array = {1, 2, 3, 4, 5};
		Node printNode = createLinkedList(array);
		System.out.println(printNode.info);
	}
}