package elseif;

import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		
String StarSign=JOptionPane.showInputDialog(null, "What is your star sign"); 	

if(StarSign.equals("aries")) {
	
	JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
	
}
else if(StarSign.equals("taurus")) {
	
	JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
	
}
else if(StarSign.equals("gemini")) {
	JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
}
else if(StarSign.equals("cancer")) {
	JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");
}
else if(StarSign.equals("leo")) {
	JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful.");
}
else if(StarSign.equals("virgo")) {
	JOptionPane.showMessageDialog(null,"Particular, logical, practical, sense of duty, critical.");
}
else if(StarSign.equals("Libra")) {
	JOptionPane.showMessageDialog(null,"Balanced, seeks beauty, sense of justice.");
}
else if(StarSign.equals("Scorpio")) {
	JOptionPane.showMessageDialog(null,"Passionate, exacting, loves extremes, combative, reflective.");
}
	
else if(StarSign.equals("Capricorn")) {
	JOptionPane.showMessageDialog(null,"Happy, absent minded, creative, adventurous.");
}
else if(StarSign.equals("Aquarius")) {
	JOptionPane.showMessageDialog(null,"Timeless, driven, calculating, ambitious.");
}
else if(StarSign.equals("Pisces")) {
	JOptionPane.showMessageDialog(null,"Likeable, energetic, passionate, sensitive.");
}
}}

