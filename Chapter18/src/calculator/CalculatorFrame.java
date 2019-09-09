package calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorFrame extends JFrame {
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private String displayExpression = "";
	
	JPanel screenPanel = new JPanel();
	JPanel numberPanel = new JPanel();
	
	class AddNumberListener implements ActionListener{
		
		String num;
		
		public AddNumberListener(String num){
			this.num = num;
			
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			displayExpression += num + "";
			screenField.setText(displayExpression);
		}
		
	}
	
	class AddClearListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			displayExpression = "";
			screenField.setText("");
		}
		
	}
	
	class AddOperationListener implements ActionListener{
		String operation;
		
		public AddOperationListener(String operation){
			this.operation = operation;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			displayExpression += operation;
			screenField.setText(displayExpression);
		}
		
	}
	
	class AddEqualsListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//parse display expression and then set answer to display
			double a;
			double b;
			double c;
			if(displayExpression.indexOf("+") > -1){
				a = Double.parseDouble(displayExpression.substring(0, displayExpression.indexOf("+")));
				b = Double.parseDouble(displayExpression.substring(displayExpression.indexOf("+") + 1));
				c = a + b;
				displayExpression = c + "";
			}
			if(displayExpression.indexOf("-") > -1){
				a = Double.parseDouble(displayExpression.substring(0, displayExpression.indexOf("-")));
				b = Double.parseDouble(displayExpression.substring(displayExpression.indexOf("-") + 1));
				c = a - b;
				displayExpression = c + "";
			}
			if(displayExpression.indexOf("*") > -1){
				a = Double.parseDouble(displayExpression.substring(0, displayExpression.indexOf("*")));
				b = Double.parseDouble(displayExpression.substring(displayExpression.indexOf("*") + 1));
				c = a * b;
				displayExpression = c + "";
			}
			if(displayExpression.indexOf("/") > -1){
				a = Double.parseDouble(displayExpression.substring(0, displayExpression.indexOf("/")));
				b = Double.parseDouble(displayExpression.substring(displayExpression.indexOf("/") + 1));
				c = a / b;
				displayExpression = c + "";
			}
			if(displayExpression.indexOf("%") > -1){
				a = Double.parseDouble(displayExpression.substring(0, displayExpression.indexOf("%")));
				b = Double.parseDouble(displayExpression.substring(displayExpression.indexOf("%") + 1));
				c = a % b;
				displayExpression = c + "";
			}
			screenField.setText(displayExpression);
			
		}
		
	}
	
	//create the buttons
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton buttonPlus = new JButton("+");//button for +
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton buttonMinus = new JButton("-");//button for -
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton buttonMultiply = new JButton("*");//button for *
	JButton button0 = new JButton("0");
	JButton buttonDot = new JButton(".");
	JButton buttonCE = new JButton("CE");
	JButton buttonDivide = new JButton("/");//button for /
	JButton buttonModulus = new JButton("%");//button for %
	JButton buttonEquals = new JButton("=");
			
	JTextField screenField = new JTextField();
	
	public CalculatorFrame(){
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		screenPanel.setLayout(new BorderLayout());
		
		//declare panel, its layout, and set the frame size
		
		numberPanel.setLayout(new GridLayout(5, 4));
		

		screenPanel.add(screenField, BorderLayout.NORTH);
		screenField.setEditable(false);
	    
		//add buttons to the panel and then add the panel to the frame
		
		numberPanel.add(button7);
		button7.addActionListener(new AddNumberListener("7"));
	    numberPanel.add(button8);
	    button8.addActionListener(new AddNumberListener("8"));
	    numberPanel.add(button9);
	    button9.addActionListener(new AddNumberListener("9"));
	    numberPanel.add(buttonPlus);
	    buttonPlus.addActionListener(new AddOperationListener("+"));
	    numberPanel.add(button4);
	    button4.addActionListener(new AddNumberListener("4"));
	    numberPanel.add(button5);
	    button5.addActionListener(new AddNumberListener("5"));
	    numberPanel.add(button6);
	    button6.addActionListener(new AddNumberListener("6"));
	    numberPanel.add(buttonMinus);
	    buttonMinus.addActionListener(new AddOperationListener("-"));
	    numberPanel.add(button1);
	    button1.addActionListener(new AddNumberListener("1"));
	    numberPanel.add(button2);
	    button2.addActionListener(new AddNumberListener("2"));
	    numberPanel.add(button3);
	    button3.addActionListener(new AddNumberListener("3"));
	    numberPanel.add(buttonMultiply);
	    buttonMultiply.addActionListener(new AddOperationListener("*"));
	    numberPanel.add(button0);
	    button0.addActionListener(new AddNumberListener("0"));
	    numberPanel.add(buttonDot);
	    buttonDot.addActionListener(new AddNumberListener("."));
	    numberPanel.add(buttonCE);
	    buttonCE.addActionListener(new AddClearListener());
	    //button7.addActionListener(new AddNumberListener(7.0));
	    numberPanel.add(buttonDivide);
	    buttonDivide.addActionListener(new AddOperationListener("/"));
	    numberPanel.add(buttonModulus);
	    buttonModulus.addActionListener(new AddOperationListener("%"));
	    numberPanel.add(buttonEquals);
	    buttonEquals.addActionListener(new AddEqualsListener());
	    
	    screenPanel.add(numberPanel, BorderLayout.CENTER);
	    
	    add(screenPanel);
	    
	}
}
