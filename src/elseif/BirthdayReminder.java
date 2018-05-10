
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		
		String momsBirthday = "Sep 1st";
		String dadsBirthday = "Dec 13th";
		String myBirthday = "May 1st";

		String birthday=JOptionPane.showInputDialog(null, "What birthday do you want to know?");	
		System.out.println(birthday);
		
if(birthday.equals("mom")){
	
	 JOptionPane.showMessageDialog(null, momsBirthday);
	
}
else if(birthday.equals("dad")) {
	JOptionPane.showMessageDialog(null, dadsBirthday);
}
else if(birthday.equals("myBirthday")) {
	JOptionPane.showInternalMessageDialog(null, myBirthday);
}
	
else {
	JOptionPane.showMessageDialog(null, "I DON'T know!!");
}

	} 
}
