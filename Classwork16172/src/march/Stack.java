package march;

//Mark Mozgovoy 3/20/17

public class Stack {
	
	Node top;
	
	public Stack(){
		this.top = null;
	}
	
	Node pop(){
		if(top != null){
			Node item = top;
			top = top.pointer;
			return item;
		}
		else{//stack empty
			System.out.println("Stack is empty.");
			return null;
		}
		
	}
	
	void push(Node item){//could just pass data, not Node
		Node t = new Node();
		t.info = item.info;
		t.pointer = top;
		top = t;
	}
	
	Node peek(){
		if(top != null){
			return top;
		}
		else{
			System.out.println("Cannot peek empty stack.");
			return null;
		}
	}
}