package submitForm;

import javax.swing.*;

public class SubmitFormViewer {
	public static void main(String[] args){
		JFrame submitForm = new SubmitFormFrame();
		submitForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		submitForm.setTitle("Submit Form");
		submitForm.setVisible(true);
	}
}
