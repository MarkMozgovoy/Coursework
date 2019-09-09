package march;

//Mark Mozgovoy 3/20/17

public class Queue {
	Node top;
	Node bottom;
	
	Node dequeue(){//removes top
		if(top != null){
			Node item = top;
			top = top.pointer;
			return item;
		}
		else{//queue empty
			System.out.println("Queue is empty.");
			return null;
		}
		
	}
	
	void enqueue(Node item){//adds item as tail
		Node oldlast = bottom;
		bottom = new Node();
		bottom.info = item.info;
		bottom.pointer = null;
        if (top == null){
        	top = bottom;
        }
        else{
        	oldlast.pointer = bottom;
        }
	}
	
	Node peek(){//returns top node
		if(top != null){
			return top;
		}
		else{
			System.out.println("Cannot peek empty queue.");
			return null;
		}
	}
}
