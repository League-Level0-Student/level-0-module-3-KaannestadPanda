//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		Random random = new Random();
		int x=random.nextInt(100);
		// LOOK ITS KARL'S PRINTLINE COMMENT!!! System.out.println(x);
		// 2. Print out the random variable above
		for(int j=0; j<10; j++) {
			String g = JOptionPane.showInputDialog("GUESS THE NUMBER!!  IT'LL BE FUN TO WATCH YOU TRY!!!");
			int GLOBGLOGABGALAB=Integer.parseInt(g);
			if(GLOBGLOGABGALAB<x) {
			JOptionPane.showMessageDialog(null, "Yo yo, you're too low!");
		}
			else if(GLOBGLOGABGALAB>x) {
				JOptionPane.showMessageDialog(null, "Oh my, guy, you're way too high!");
			}
			else if(GLOBGLOGABGALAB==x) {
				JOptionPane.showMessageDialog(null, "HOW DID YOU DO IT, FOOLISH HUMAN?!?!?!  A-X-O-L-O-T-L...!!!");
		System.exit(0);
			}
			
			if(j==9) {
				JOptionPane.showMessageDialog(null, "HAH!  YOU FAILED!!  THE NUMBER WAS " +x+ ", BRANIAC!!!! HAHHHAHAHAHHHAHAHAHAH!!!!!");
			}
			
		}
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


