/**
 * 
 * @author Mark Mozgovoy 9/11/17
 *
 */

/**
 * 
 * This class is used to create a linked list of nodes which are made up of students.
 *
 */
public class LinkedListForStudents {
	
	//points to the first student node in the list
	private StudentNode head;
	
	//constructor
	public LinkedListForStudents(StudentNode head){
		this.head = head;
	}
	
	//returns the head of the list
	public StudentNode getHead(){
		return this.head;
	}
}
