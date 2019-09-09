package Exercise7;

public class Textbook extends Book{
	private int gradeLevel;
	
	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public Textbook(String title, int pages, int gradeLevel) {
		super(title, pages);
		// TODO Auto-generated constructor stub
		this.gradeLevel = gradeLevel;
	}
	
}
