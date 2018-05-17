//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class ShinyObjects {
	public static void main(String[] args) {

String object=JOptionPane.showInputDialog(null,"How many shiny object do you want?");
		// 3. Play the sound that many times

int num=Integer.parseInt(object);
		
		for(int i=0; i<num; i++) {
			playMisterZee();
		}

			
	}

	public static void playMisterZee(){
    	try {
 
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(AudioSystem.getAudioInputStream(ShinyObjects.class.getResource("shiny-objects.wav")));
   		 clip.start();
   		 Thread.sleep(3600);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}
}



