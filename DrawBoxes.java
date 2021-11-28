package ch14java6thedition;

/**
 *
 * @author craig
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class DrawBoxes extends JApplet {
	
	private int currentX;
	private int currentY;
	private int width;
	private int height;

	/**
	 * init method.
	 */
	public void init() {

		// Add a mouse listener and a mouse motion listener
		addMouseListener(new MyMouseListener());
		addMouseMotionListener(new MyMouseMotionListener());

	}

	/**
	 * The paint method.
	 * @param g The applet's Graphics object.
	 */
	public void paint(Graphics g) {

		// Call the superclass's paint method
		super.paint(g);
		
		// Draw a rectangle
		g.drawRect(currentX, currentY, width, height);
	}

	/**
	 * Private inner class to handle the mouse listener events. 
	 */
	private class MyMouseListener implements MouseListener {

		@Override
		public void mousePressed(MouseEvent e) {
			// Get the mouse coordinates 
			currentX = e.getX();
			currentY = e.getY();
		}
		@Override
		public void mouseReleased(MouseEvent e){
		}
		@Override
		public void mouseEntered(MouseEvent e) {
		}
		@Override
		public void mouseClicked(MouseEvent e) {
		}
		@Override 
		public void mouseExited(MouseEvent e) {
		}

	}

	/**
	 * Private inner class to handle the mouse dragging events.
	 */
	private class MyMouseMotionListener implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {

			// Calculate the size of the rectangle
			width = e.getX() - currentX;
			height = e.getY() - currentY;
			
			// Repaint the window
			repaint();
		}
		@Override
		public void mouseMoved(MouseEvent e) {
		}

	}

}
