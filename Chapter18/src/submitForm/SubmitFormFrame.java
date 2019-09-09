package submitForm;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SubmitFormFrame extends JFrame{
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 500;
	private static final int FIELD_WIDTH = 15;
	
	public SubmitFormFrame(){
		JLabel usernameLabel = new JLabel("Username:");
		JTextField usernameField = new JTextField(FIELD_WIDTH);
		JLabel passwordLabel = new JLabel("Password:");
		JTextField passwordField = new JTextField(FIELD_WIDTH);
		JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
		JTextField confirmPasswordField = new JTextField(FIELD_WIDTH);
		JLabel fNameLabel = new JLabel("First Name:");
		JTextField fNameField = new JTextField(FIELD_WIDTH);
		JLabel mInitialLabel = new JLabel("Middle Initial:");
		JTextField mInitialField = new JTextField(FIELD_WIDTH);
		JLabel lNameLabel = new JLabel("Last Name:");
		JTextField lNameField = new JTextField(FIELD_WIDTH);
		JLabel addressLabel = new JLabel("Street Address:");
		JTextField addressField = new JTextField(FIELD_WIDTH);
		JLabel cityLabel = new JLabel("City:");
		JTextField cityField = new JTextField(FIELD_WIDTH);
		JLabel stateLabel = new JLabel("State:");
		JComboBox stateBox = new JComboBox();
		String[] stateArray = {"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE",
				"FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA",
				"MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH",
				"NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD",
				"TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY"};
		for(int i = 0; i < 50; i++){
			stateBox.addItem(stateArray[i]);
		}
	    stateBox.setEditable(false);
	    
		JLabel zipLabel = new JLabel("Zip:");
		JTextField zipField = new JTextField(FIELD_WIDTH);
		JLabel genderLabel = new JLabel("Gender:");
		JRadioButton maleButton = new JRadioButton("Male");
	    JRadioButton femaleButton = new JRadioButton("Female");
	    maleButton.setSelected(true);
	    ButtonGroup group = new ButtonGroup();
	    group.add(maleButton);
	    group.add(femaleButton);
	    JCheckBox bsCheckBox = new JCheckBox("BS");
	    JCheckBox msCheckBox = new JCheckBox("MS");
	    JCheckBox phdCheckBox = new JCheckBox("PhD");
		JLabel degreeLabel = new JLabel("Degree(s):");
		JButton submitButton = new JButton("Submit");
		
		class SubmitListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Username: " + usernameField.getText());
			}
			
		}
		submitButton.addActionListener(new SubmitListener());
		
		JPanel panel = new JPanel();
		JPanel panelButtons = new JPanel();
		JPanel panelFields = new JPanel();
		JPanel panelChecks = new JPanel();
		
		panelFields.setLayout(new GridLayout(12, 2));
		panelFields.add(usernameLabel);
		panelFields.add(usernameField);
		panelFields.add(passwordLabel);
		panelFields.add(passwordField);
		panelFields.add(confirmPasswordLabel);
		panelFields.add(confirmPasswordField);
		panelFields.add(fNameLabel);
		panelFields.add(fNameField);
		panelFields.add(mInitialLabel);
		panelFields.add(mInitialField);
		panelFields.add(lNameLabel);
		panelFields.add(lNameField);
		panelFields.add(addressLabel);
		panelFields.add(addressField);
		panelFields.add(cityLabel);
		panelFields.add(cityField);
		panelFields.add(stateLabel);
		panelFields.add(stateBox);
		panelFields.add(zipLabel);
		panelFields.add(zipField);
		panelFields.add(genderLabel);
		panelFields.add(panelButtons);
		
		panelButtons.add(maleButton);
		panelButtons.add(femaleButton);
		
		panelFields.add(degreeLabel);
		
		panelChecks.add(bsCheckBox);
		panelChecks.add(msCheckBox);
		panelChecks.add(phdCheckBox);
		panelFields.add(panelChecks);
		
		panel.setLayout(new BorderLayout());
		panel.add(panelFields, BorderLayout.CENTER);
		panel.add(submitButton, BorderLayout.SOUTH);
		add(panel);
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
}
