package extra;

import javax.swing.JOptionPane;

public class secretmesagebox {
	public static void main(String[] args) {
		
	

	String c = "100";
	String x = JOptionPane.showInputDialog("Give me a secret message.");
String j = JOptionPane.showInputDialog("What is the password?"); {
	if( c.equals(j)) {
		JOptionPane.showMessageDialog(null, "Congratulations, the secret message was: " + x);
	}
	else {
		JOptionPane.showMessageDialog(null, "Intruder!");
	}
}
}
}
