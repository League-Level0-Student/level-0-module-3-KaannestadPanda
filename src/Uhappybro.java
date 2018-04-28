import javax.swing.JOptionPane;

public class Uhappybro {
	public static void main(String[] args) {

		String bro = JOptionPane.showInputDialog("Are you happy with your life, my dude?");

		if (bro.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing good, my dude!");
		} else if (bro.equals("no")) {
			String two = JOptionPane.showInputDialog("Do you wanna be happy tho?");

			if (two.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something then, brozone!");
			}
			if (two.equals("no")) {
				JOptionPane.showMessageDialog(null, "Well then, keep being underaverage and dissatisfying!");

			}

			else {
				JOptionPane.showInputDialog(
						"Wow, you messed up the whole thing!  I thought you were OK because you missed the first opportunity to mess it up!!!!  Looks like I was WRONG!!!!!!!!!");
				JOptionPane.showMessageDialog(null,"YEAH, NO ONE CARES ABOUT YOUR OPINON!!!!!");
			}

		}
		else {
			JOptionPane.showInputDialog(
					"Wow, you messed up the whole thing!  I hope you're happy with ruining my dreams of a good flowchart!!!");
			JOptionPane.showMessageDialog(null,"YEAH, NO ONE CARES ABOUT YOUR OPINON!!!!!");
		}
	}
}
