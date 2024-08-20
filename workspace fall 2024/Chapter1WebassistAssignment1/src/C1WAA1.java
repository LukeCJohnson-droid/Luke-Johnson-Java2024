// Luke Johnson 8-16 random number generator

import javax.swing.JOptionPane;

public class C1WAA1 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Guess a number between 1 and 10");
		JOptionPane.showMessageDialog(null,"The number is "+

		(1 + (int)(Math.random() * 10)));

	}

}
