//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot DnakMemes = new Robot();
		DnakMemes.penDown();
		Random gen = new Random();
		DnakMemes.setSpeed(9001);
		// 3. Ask the user what color they would like the robot to draw
		for(int j=0; j<10; j++) {
		String huh = JOptionPane.showInputDialog("What color breh");
		if (huh.equals("green")) {
			DnakMemes.setPenColor(0, 255, 0);
		} 
		else if (huh.equals("red")) {
			DnakMemes.setPenColor(255, 0, 0);
		}
		else if (huh.equals("blue")) {
			DnakMemes.setPenColor(0, 0, 255);
		}
		else if (huh.equals("no idea")) {
			DnakMemes.setRandomPenColor();
		}
		else if (huh.equals("manliness")) {
			DnakMemes.setPenColor(255,20,243);
		}
		else if (huh.equals("")) {
			DnakMemes.setRandomPenColor();
		}
		int x=gen.nextInt(360);
		DnakMemes.move(x);
		DnakMemes.turn(x);
		}
		// 5. Use an if/else statement to set the pen color that the user requested

		// 6. If the user doesn’t enter anything, choose a random color

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10

		// 2. Make the robot draw a shape (this will take more than one line of code)

	}
}
