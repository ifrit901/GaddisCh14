package ch14java6thedition;

/**
 * This is Code Listing 14-11, it demonstrates some of 
 * the graphics methods offered by java. I'll be using 
 * a swing frame to render these examples since I can't get
 * the applets to display in the web browser (firefox). 
 * 
 * @author craig
 */
import javax.swing.*;
import java.awt.*;
public class LineDemo extends Canvas{
		
	/*
	This demonstrates how a line can be drawn.
	*/
	public LineDemo() {

		setBackground(Color.WHITE);
		setLocation(400, 250);
		setSize(300, 300);


		// Call the paint method

		setVisible(true);
		paint(this.getGraphics());

	}

	/**
	 * The paint method.
	 * @param g The window's Graphics object.
	 */
	@Override
	public void paint(Graphics g) {
		// Call the superclass paint method
		super.paint(g);

		// Draw a red line from (20, 20) to (280, 280)
		g.setColor(Color.red);
		g.drawLine(20, 20, 280, 280);

		
	}
	public static void main(String[]args) {
		new LineDemo();
	}

}
