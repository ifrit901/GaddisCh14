package ch14java6thedition;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
/**
 * 
 * @author craig
 */
public class DrawingCanvas extends JComponent {
	
	private int width;
	private int height;

	public DrawingCanvas(int w, int h) {
		
		width = w;
		height = h;

	}

	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Rectangle2D.Double r = new Rectangle2D.Double(50, 75, 100, 250);
		g2d.setColor(new Color(100, 149, 237));
		g2d.fill(r);
		Ellipse2D.Double e = new Ellipse2D.Double(200, 75, 100, 100);
		g2d.setColor(Color.BLUE);
		g2d.fill(e);
	}

}
