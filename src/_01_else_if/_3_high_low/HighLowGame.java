
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int randy = new Random().nextInt(101);
		
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		int gues = 0;
		while (gues <= 10) {
			// 1. Ask the user for a guess using a pop-up window, and save their response
String gueses = JOptionPane.showInputDialog(null, "Enter a number betwee 1 - 100, you only have 10 guesses");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guess = Integer.parseInt(gueses);
			
				
			// 5. if the guess is correct
				// 6. Win
			if (randy == guess) {
				JOptionPane.showMessageDialog(null, "You've Won!");
				System.exit(0);
			}
			
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			if(guess > randy) {
				JOptionPane.showMessageDialog(null, "Your guess is too High");
				gues = gues +1;
			}
			// 7. if the guess is high
				// 8. Tell them it's too high
			if (guess < randy) {
				JOptionPane.showMessageDialog(null, "Your Guess is too Low");
				gues = gues +1;
			}
			}
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		if (gues > 10) {
			JOptionPane.showMessageDialog(null, "You've Lost");
			
		}
	}

}


