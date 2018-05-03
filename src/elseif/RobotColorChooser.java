//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		int robot = 3;
		String robot1 = "bob";
		Robot robotbob = new Robot();

		for (int i = 0; i < 10; i++) {

			String q = JOptionPane.showInputDialog(null, "What color do you want the robot to be?");

			if (q.equals("black")) {

				robotbob.setPenColor(0, 0, 0);
			}

			else if (q.equals("red")) {

				robotbob.setPenColor(255, 0, 0);
			}

			else if (q.equals("blue")) {

				robotbob.setPenColor(0, 0, 255);
			} else {

				robotbob.setRandomPenColor();

			}
			robotbob.penDown();

			robotbob.setSpeed(100);
			for (int i1 = 0; i1 < 10; i1++) {

				robotbob.setPenWidth(10);

				robotbob.move(90);
				robotbob.turn(90);

			}
		}
	}
}
