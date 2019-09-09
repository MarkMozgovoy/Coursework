package menuDesign;

import javax.swing.JFrame;

public class MenuViewer {
	public static void main(String[] args)
	   {  
	      JFrame frame = new MenuFrame();
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setTitle("MenuViewer");
	      frame.setVisible(true);      
	   }
}
