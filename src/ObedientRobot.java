import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot robotbob = new Robot();
	public static void main(String[] args) {
		
		robotbob.penDown();
		robotbob.setSpeed(100);
	String shape=JOptionPane.showInputDialog(null, "Which shape do you want");
	String color=JOptionPane.showInputDialog(null, "Which color do you want");
	
	if(color.equals("black")) {
		
	robotbob.setPenColor(0, 0, 0);
	
	}
	else if(color.equals("blue")) {
		robotbob.setPenColor(0,0,250);
	}
	
	if(shape.equals("square")) {
		
		drawsquare();
		
	}
	else if(shape.equals("circle")) {
		
		drawcircle();
		
		
	}
	else if(shape.equals("triandgle")) {
		
		drawtriangle();
	}
	
	
		
		
		
		
		
	}
	
	static void drawsquare(){
	
		
		robotbob.move(90);
		robotbob.turn(90);
		
		robotbob.move(90);
		robotbob.turn(90);
		
		robotbob.move(90);
		robotbob.turn(90);
		
		robotbob.move(90);
		robotbob.turn(90);

}
	
	static void drawtriangle() {
		
		robotbob.move(90);
		robotbob.turn(120);
		
		robotbob.move(90);
		robotbob.turn(120);
		
		robotbob.move(90);
		robotbob.turn(120);
		
}
	
	static void drawcircle() {
		
		
for (int i = 0; i < 360; i++) {
			
		
		robotbob.move(1);
		robotbob.turn(1);
		
}
	}
	
		
}
	
	
	
	
	
	
	
	
	