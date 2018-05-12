import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
	static Robot dnak = new Robot();
	
	public static void main(String[] args) {
		
		String col =JOptionPane.showInputDialog("WHAT COLOR BRO");
		if(col.equals("red")) {
			dnak.setPenColor(255, 0, 0);
		}
		
		if(col.equals("green")) {
			dnak.setPenColor(0, 255, 0);
		}
		
		if(col.equals("blue")) {
			dnak.setPenColor(0, 0, 255);
		}
		
		if(col.equals("barf")) {
			dnak.setPenColor(50, 100, 50);
		}
		
		if(col.equals("password")) {
		dnak.setSpeed(9001);
			dnak.turn(90);
			hehehe();
			System.exit(0);
		}
		
		
		dnak.penDown();
		dnak.setSpeed(9001);
	
		
		
		
		
		
		
		
		String shape =JOptionPane.showInputDialog("WHAT SHAPE THO");
		
		if(shape.equals("square")) {
			square();
		}
		
		if(shape.equals("tri")) {
			tri();
		}
		
		if(shape.equals("circ")) {
			circ();
		}
		
		
	}

	
	public static void square() {
		

		for (int y = 0; y < 4; y++) {
			dnak.move(200);
			dnak.turn(90);
		}

	}
	
	public static void tri() {
		

		for (int y = 0; y < 3; y++) {
			dnak.move(200);
			dnak.turn(120);
		}

	}
	
public static void circ() {
		

		for (int y = 0; y < 360; y++) {
			dnak.move(2);
			dnak.turn(1);
		}

	}

public static void hehehe() {
	
	Random gen=new Random();
	for (int y = 0; y < 2000000; y++) {
		dnak.penDown();
		dnak.setSpeed(9001);
		int x = gen.nextInt(60)-20;
		dnak.setRandomPenColor();
		dnak.move(x);
		dnak.turn(x);
	}

}

}
