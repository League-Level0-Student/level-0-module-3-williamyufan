import javax.swing.JOptionPane;

public class AreYouHappy {
	
	public static void main(String[] args) {
		
		String ahappy=JOptionPane.showInputDialog(null, "Are You Happy?");
		
		if(ahappy.equals("yes")) {
		
		JOptionPane.showMessageDialog(null, "Keep Doing What You Are Doing");
	}
		else if(ahappy.equals("no")) {
			
			JOptionPane.showInputDialog(null, "Do You Want Be Happy" );
		}

}
}