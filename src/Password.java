import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Password {
	public static void main(String[] args) throws FileNotFoundException {

		Calendar cal = Calendar.getInstance();

		JOptionPane.showMessageDialog(null,
				"Password Generator Made By Mitchell Reiff, Daniel Watahan & Florjon Haxhija.");

		Float number1 = new Float(JOptionPane.showInputDialog(null, "Input A Number Over 100"));

		Float number2 = new Float(JOptionPane.showInputDialog(null, "Input your year of birth."));

		Float number3 = new Float(JOptionPane.showInputDialog(null, "Input your month of birth (Number)."));

		Float number4 = new Float(JOptionPane.showInputDialog(null,
				"Input use for this password (1):Email (2):Game (3):Application (4):Other (Use Number)"));

		Float result = number1.floatValue() * number3.floatValue() * number4.floatValue() * number2.floatValue() * 23;

		JOptionPane.showMessageDialog(null, "Your Password is " + result);

		try (PrintWriter out = new PrintWriter(cal.getTimeInMillis() + ".txt")) {

			out.println("Enjoy your password!");
			out.println("Your Password is " + result);

		}

		JOptionPane.showMessageDialog(null, "Goodby Have A Great Day! Do Not Forget Your Password!");
	}
}
