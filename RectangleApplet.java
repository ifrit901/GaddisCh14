package ch14java6thedition;

/**
 * This creates a rectangle shape in an applet.
 * 
 * @author craig
 */
import java.awt.*;
import javax.swing.*;
public class RectangleApplet extends JApplet{

	int x = 10, y = 10;

	public void init() {
		getContentPane().setBackground(Color.white);
	}
	/**
	 * The paint method.
	 * @param g The applet's Graphics object.
	 */
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// Draw a rectangle
		g.drawRect(x, y, 120, 120);

		g.drawRect(100, 100, 120, 120);

		g.drawOval(150, 150, 100, 100);
	}
	
}
