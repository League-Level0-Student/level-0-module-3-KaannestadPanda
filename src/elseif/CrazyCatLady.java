//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String CATZ = JOptionPane.showInputDialog("How many cats do you have bro?");
		// 2. Convert their answer into an int
int brobro = Integer.parseInt(CATZ);
if(brobro>2){
	JOptionPane.showMessageDialog(null, "YOU ARE A KRAZY CAT MAN, MAN!");
}
else if(brobro<3&&brobro>0) {
	playVideo("https://www.youtube.com/watch?v=NREtpoqE_HU");
			
		} 
else if(brobro<1) {
	
	JOptionPane.showInputDialog("PREPARE TO BE SATISFIED!!!");
	
	playVideo("https://www.youtube.com/watch?v=ZJT9CeEhM10");
			
		} 
	
	
	}
	

		// 3. If they have 3 or more cats, tell them they are a crazy cat lady

		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video

		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
	

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

