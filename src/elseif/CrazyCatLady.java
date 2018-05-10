//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 9

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		String q = JOptionPane.showInputDialog(null, "How many cats do you have?");


int cats=Integer.parseInt(q);
		
if (cats>=3){

	 JOptionPane.showMessageDialog(null, "You are a crazy cat person!!!!!!");
}

else if(cats<3&&cats>0) {
	


	playVideo("https://www.youtube.com/watch?v=5dsGWM5XGdg");

		
		
	}
else if(cats<=0) {
	playVideo("https://www.youtube.com/watch?v=W_juM14WHNQ");
}
}
	

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

