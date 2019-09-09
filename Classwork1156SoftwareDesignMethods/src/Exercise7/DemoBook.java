package Exercise7;

public class DemoBook {
	public static void main(String[] args){
		Book book1 = new Book("First Book", 100);
		Textbook book2 = new Textbook("First Text Book", 150, 5);
		Textbook book3 = new Textbook("Second Text Book", 170, 4);
		System.out.println("Book Name: " + book1.getTitle() + " Pages: " + book1.getPages());
		System.out.println("TextBook Name: " + book2.getTitle() + " Pages: " + book2.getPages() + " Grade Level: " + book2.getGradeLevel());
		System.out.println("TextBook Name: " + book3.getTitle() + " Pages: " + book3.getPages() + " Grade Level: " + book3.getGradeLevel());
	}
}