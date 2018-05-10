//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		
		int random = new Random().nextInt(99)+1;
		
		System.out.println(random);		
		for (int i = 0; i < 10; i++) {
		
			String guess=JOptionPane.showInputDialog(null, "guess a number between 1-100");

			int num=Integer.parseInt(guess);
			
			if(num==random) {
			
				JOptionPane.showMessageDialog(null, "YOU WIN!!!!!!!!!!!!!!!!");
				System.exit(0);
			}
		
			else if(num>random) {
				JOptionPane.showMessageDialog(null, "Your Guess Is Tooooooooooooo HIGH!!");
			}
			else if(num<random) {
				JOptionPane.showMessageDialog(null,  "Your Guess Is Tooooooooooooo LOW!!!!!");
			}
				
			
		
				
		
				

		
		
	}
		JOptionPane.showMessageDialog(null, "YOU LOSE!! LOSER");

	}}


