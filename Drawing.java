
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends Canvas{
	
	
	public void paint (Graphics g){
	    g.fillOval(100,100,200,200);
	   	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  JFrame window = new JFrame ("My Drawing");
	        Canvas canvas = new Drawing();
	        canvas.setSize(400, 400);
	        window.add(canvas);
	        window.pack();
	        window.setVisible(true);
	}

}
