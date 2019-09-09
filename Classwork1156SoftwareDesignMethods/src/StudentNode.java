/**
 * 
 * @author Mark Mozgovoy 9/11/17
 *
 */

/**
 * 
 * This class is used for creating nodes for students to be used in a linked list.
 *
 */
public class StudentNode {
	
	//the node contains a student and has an accessible pointer towards the next student node in the list
	private Student s;
	public StudentNode nextNode;
	
	//constructor
	public StudentNode(Student s){
		this.s = s;
	}
	
	//returns the student contained in the node
	public Student getStudent(){
		return this.s;
	}
}
