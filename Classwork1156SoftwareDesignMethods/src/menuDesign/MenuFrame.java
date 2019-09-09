package menuDesign;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MenuFrame extends JFrame {
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	
	public MenuFrame(){  
	      
		ButtonGroup group = new ButtonGroup();
	    JRadioButton smallButton = new JRadioButton("Small");
	    JRadioButton mediumButton = new JRadioButton("Medium");
	    JRadioButton largeButton = new JRadioButton("Large");
		group.add(smallButton);
	    group.add(mediumButton);
	    group.add(largeButton);
	    
	    JCheckBox pepperoniCheckBox = new JCheckBox();
	    JCheckBox anchoviesCheckBox = new JCheckBox();
	    
	    JLabel label = new JLabel("Your order: ");
	    JLabel pepperoniLabel = new JLabel("Pepperoni");
	    JLabel anchoviesLabel = new JLabel("Anchovies");
	    JTextField field = new JTextField(20);
	    
	    JPanel panel = new JPanel();
	    JPanel radioPanel = new JPanel();
	    radioPanel.setLayout(new GridLayout(3, 1));
	    JPanel checkPanel = new JPanel();
	    radioPanel.setLayout(new GridLayout(2, 1));
	    JPanel outPanel = new JPanel();
	    radioPanel.add(smallButton);
	    radioPanel.add(mediumButton);
	    radioPanel.add(largeButton);
	    
	    checkPanel.add(pepperoniCheckBox);
	    checkPanel.add(pepperoniLabel);
	    checkPanel.add(anchoviesCheckBox);
	    checkPanel.add(anchoviesLabel);
	    
	    outPanel.add(label);
	    outPanel.add(field);
	    
	    add(panel);
	    panel.add(radioPanel, BorderLayout.CENTER);
	    panel.add(checkPanel, BorderLayout.CENTER);
	    panel.add(outPanel, BorderLayout.SOUTH);

	    setSize(FRAME_WIDTH, FRAME_HEIGHT);
	   }
}
