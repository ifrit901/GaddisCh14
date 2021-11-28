package ch14java6thedition;

/**
 * This example will be modified to use a JFrame
 * instead of an applet to try to make a ball bounce.
 * 
 * @author craig
 */
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.awt.*;
public class BouncingBall extends JApplet {
	
	private final int X = 109;		// Ball's X coordinate
	private final int WIDTH = 40;		// Ball's width
	private final int HEIGHT = 40;		// Ball's height
	private final int TIME_DELAY = 20;	// Time delay
	private final int MOVE = 20;		// Pixels to move ball
	private final int MINIMUM_Y = 50;	// Minimum height of ball
	private final int MAXIMUM_Y = 400;	// Maximum height of ball
	private int Y = 400; 			// Ball's Y coordinate
	private boolean goingUp = true; 	// Direction indicator
	private Timer timer;			// Timer object

		
	@Override
	public void init() {
		timer = new Timer(TIME_DELAY, new TimerListener());
		timer.start();
	}
	public void paint(Graphics g) {

		super.paint(g);	 	// Call the super class paint method
		g.setColor(Color.red); 	// Set the drawing color to red
		g.fillOval(X, Y, WIDTH, HEIGHT);// Draw the ball

	}

	/**
	 * Private inner class that handles the events of the 
	 * Timer object.
	 */
	public class TimerListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// Update the ball's Y coordinate
			if(goingUp) {
				if(Y > MINIMUM_Y) {
					Y -= MOVE;
				} else
					goingUp = false;
			} else {
				if(Y < MAXIMUM_Y) {
					Y += MOVE;
				} else
					goingUp = true;
			}
			// Force a call to the repaint method
			repaint();
		}	

	}


}
