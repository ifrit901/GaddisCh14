package ch14java6thedition;

import javax.swing.JApplet;

/**
 * This is Programming challenge #1. It prints the word "Hello"
 * in an applet window and the word follows the mouse cursor around.
 * 
 * @author craig
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class FollowMe extends JApplet {
	/**
	 * Initialization method that will be called after the applet is loaded
	 * into the browser.
	 */
	private int x = 100, y = 100;

	public void init() {
		addMouseMotionListener(new moves());
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("Hello", x, y);
	}
    // TODO overwrite start(), stop() and destroy() methods
	private class moves implements MouseMotionListener {
		public void mouseMoved(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();
		}
		public void mouseDragged(MouseEvent e) {
		}
	}
}
