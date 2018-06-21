package extra;

import javax.swing.JOptionPane;

public class Theriddler {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Your current score is zero, work on improving it by correctly answering riddles.");
	int i = 0;	
String x = JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you will die?");  
	if (x.equals("Nothing"))  {
		JOptionPane.showMessageDialog(null, "Correct");
		System.out.println(i = 100);
		 
		 
	}
	else {
		JOptionPane.showMessageDialog(null, "Incorrect. The answer is nothing.");
		System.out.println(i = -10);
		
	}
	
String k =	JOptionPane.showInputDialog("What is a door that is half open called?");
if (k.equals("Ajar"))  {
	JOptionPane.showMessageDialog(null, "Correct");
	 System.out.println(i = 200);
	 
	 
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect. The answer is ajar.");
	System.out.println(i = -20);
	
}
JOptionPane.showInputDialog("What goes up when the rain comes down?");
if (x.equals("An umbrella"))  {
	JOptionPane.showMessageDialog(null, "Correct");
	System.out.println(i = 300); 
	 
	 
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect. The answer is An umbrella.");
	System.out.println(i = -30);
	
}
System.out.println(i);
	}
}
