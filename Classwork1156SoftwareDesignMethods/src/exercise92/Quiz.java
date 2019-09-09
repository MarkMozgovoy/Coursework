package exercise92;

import java.util.ArrayList;

public class Quiz implements Measurable {
	
	String letterGrade;
	double grade;
	
	
	public Quiz(double grade){
		this.grade = grade;
		if(grade >= 93){
			this.letterGrade = "A";
		}else if(grade >= 90 && grade < 93){
			this.letterGrade = "A-";
		}else if(grade >= 87 && grade < 90){
			this.letterGrade = "B+";
		}else if(grade >= 84 && grade < 87){
			this.letterGrade = "B";
		}else if(grade >= 80 && grade < 84){
			this.letterGrade = "B-";
		}else if(grade >= 77 && grade < 80){
			this.letterGrade = "C+";
		}else if(grade >= 74 && grade < 77){
			this.letterGrade = "C";
		}else if(grade >= 70 && grade < 74){
			this.letterGrade = "C-";
		}else if(grade >= 67 && grade < 70){
			this.letterGrade = "D+";
		}else if(grade >= 60 && grade < 67){
			this.letterGrade = "D";
		}else if(grade < 60){
			this.letterGrade = "F";
		}
	}
	
	@Override
	public String getLetterGrade() {
		return this.letterGrade;
	}

	@Override
	public double getGrade() {
		return this.grade;
	}
	
	public static void main(String[] args){
		ArrayList<Quiz> quizList = new ArrayList<Quiz>();
		quizList.add(new Quiz(60));
		quizList.add(new Quiz(75));
		quizList.add(new Quiz(40));
		quizList.add(new Quiz(100));
		quizList.add(new Quiz(90));
		quizList.add(new Quiz(75));
		quizList.add(new Quiz(87));
		quizList.add(new Quiz(78));
		quizList.add(new Quiz(89));
		quizList.add(new Quiz(85));
		
		System.out.println("The following is the array list of quizzes.");
		for(int i = 0; i < quizList.size(); i++){
			System.out.print(quizList.get(i).getGrade() + " ");
		}
		
		double max = quizList.get(0).getGrade();
		Quiz maxQuiz = quizList.get(0);
		for(int i = 0; i < quizList.size(); i++){
			if(quizList.get(i).getGrade() >= max){
				max = quizList.get(i).getGrade();
				maxQuiz = quizList.get(i);
			}
		}
		System.out.println("\nThe max quiz had a grade of " + maxQuiz.getGrade() + " and a letter grade of " + maxQuiz.getLetterGrade() + ".");
		
		double sum = 0;
		for(int i = 0; i < quizList.size(); i++){
			sum += quizList.get(i).getGrade();
		}
		double average = sum/quizList.size();
		Quiz averageQuiz = new Quiz(average);
		System.out.println("The average grade of the quizzes is " + average + ", the average letter grade, therefore, is " + averageQuiz.getLetterGrade() + ".");
	}

}
