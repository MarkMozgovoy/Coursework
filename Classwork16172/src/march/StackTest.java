package march;

//Mark Mozgovoy 3/20/17

public class StackTest {
	public static void main(String[] args){
		Node node3 = new Node(1, null);
		Node node2 = new Node(3, null);
		Node node1 = new Node(5, null);
		
		//STACK TEST
		Stack stack = new Stack();
		stack.push(node3);
		stack.push(node2);
		stack.push(node1);
		
		System.out.println("This is the starting stack: ");
		Node current = stack.top;
		while(current != null){
			System.out.print(current.info + " ");
			current = current.pointer;
		}
		
		System.out.println("\n\nNow we will push 6 to the beginning of the stack: ");
		Node newNode = new Node(6, null);
		stack.push(newNode);
		
		System.out.println("This is the new stack: ");
		current = stack.top;
		while(current != null){
			System.out.print(current.info + " ");
			current = current.pointer;
		}
		
		System.out.println("\n\nNow we will pop from the stack: ");
		stack.pop();
		System.out.println("This is the newest stack: ");
		current = stack.top;
		while(current != null){
			System.out.print(current.info + " ");
			current = current.pointer;
		}
		
		System.out.println("\n\nThe top of the newest stack is " + stack.peek().info + ".");
		
		
		//QUEUE TEST
		Queue queue = new Queue();
		queue.enqueue(new Node(3, null));
		queue.enqueue(new Node(6, null));
		queue.enqueue(new Node(9, null));
		System.out.println("\n*********************\n\nThe queue is: ");
		Node newCurrent = queue.top;
		while(newCurrent != null){
			System.out.print(newCurrent.info + " ");
			newCurrent = newCurrent.pointer;
		}
		
		System.out.println("\n\nDequeue! ");
		queue.dequeue();
		System.out.println("The queue is: ");
		newCurrent = queue.top;
		while(newCurrent != null){
			System.out.print(newCurrent.info + " ");
			newCurrent = newCurrent.pointer;
		}
		
		System.out.println("\n\nPeek! ");
		System.out.println("The top of the queue is: " + queue.peek().info);
		
	}
}