/**
 * 
 * @author Mark Mozgovoy 9/11/17
 *
 */

/**
 * 
 * This class answers the homework question
 *
 */
public class StudentTest {
	public static void main (String[] args){
		
		//students constructed
		Student student1 = new Student(3.6, "Mark");
		Student student2 = new Student(3.9, "Thomas");
		Student student3 = new Student(3.7, "Mary");
		Student student4 = new Student(4.0, "Kevin");
		Student student5 = new Student(3.5, "Maxwell");
		
		//store students in a linked list
		//create nodes for the list
		StudentNode student1Node = new StudentNode(student1);
		StudentNode student2Node = new StudentNode(student2);
		StudentNode student3Node = new StudentNode(student3);
		StudentNode student4Node = new StudentNode(student4);
		StudentNode student5Node = new StudentNode(student5);
		
		//link the nodes
		student1Node.nextNode = student2Node;
		student2Node.nextNode = student3Node;
		student3Node.nextNode = student4Node;
		student4Node.nextNode = student5Node;
		
		//create the linked list and print it
		LinkedListForStudents studentList = new LinkedListForStudents(student1Node);
		System.out.println("These are the students in the linked list: ");
		StudentNode current = studentList.getHead();
		while(current != null){
			System.out.println(current.getStudent().getName() + " has a GPA of " + current.getStudent().getGPA() + ".");
			current = current.nextNode;
		}
		System.out.println();
		
		//search for highest and lowest gpa and output the names of the students
		current = studentList.getHead();
		double maxGPA = current.getStudent().getGPA();
		double minGPA = current.getStudent().getGPA();
		StudentNode maxStudent = current;
		StudentNode minStudent = current;
		while(current != null){
			if(maxGPA < current.getStudent().getGPA()){
				maxGPA = current.getStudent().getGPA();
				maxStudent = current;
			}
			if(minGPA > current.getStudent().getGPA()){
				minGPA = current.getStudent().getGPA();
				minStudent = current;
			}
			current = current.nextNode;
		}
		
		//print the students with lowest and highest GPA
		System.out.println("The student with the highest GPA is " + maxStudent.getStudent().getName() + " with a GPA of " + maxStudent.getStudent().getGPA() + ".");
		System.out.println("The student with the lowest GPA is " + minStudent.getStudent().getName() + " with a GPA of " + minStudent.getStudent().getGPA() + ".");
	}
}
