
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "soon";
		String dadsBirthday = "earlier";
		String myBirthday = "DECEMBER FOURTH, TWO THOUSAND AND FOUR";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String swag = JOptionPane.showInputDialog("What birthday do you want, though?");
		// 3. Print out what the user typed
		System.out.println(swag);
		if(swag.equals ("mom")) {
			System.out.println(momsBirthday);
		}
		else if(swag.equals ("dad")) {
			System.out.println(dadsBirthday);
		}
		else if(swag.equals ("karl")) {
			System.out.println(myBirthday);
		}
		else {
			System.out.println("NO U");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
