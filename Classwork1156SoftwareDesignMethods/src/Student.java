/**
 * @author Mark Mozgovoy 9/11/17
 */

//**********This class was given along with the homework assignment.

/**
   A Student class with student name and GPA.
*/
public class Student
{  
   private double gpa;
   private String studentName;

   /**
      Constructs a student.
   */
   public Student(double studentGpa, String n)
   {   
      gpa = studentGpa;
      studentName = n;
   }

   
   /**
      Gets the current GPA of the student.
      @return the GPA
   */
   public double getGPA()
   {   
      return gpa;
   }

   public String getName()
   {   
      return studentName;
   }
}