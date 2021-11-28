package ch14java6thedition;

import javax.swing.JApplet;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author craig
 */
public class SimpleApplet extends JApplet {

	/**
	 * Initialization method that will be called after the applet is loaded
	 * into the browser.
	 */
	public void init() {
		// Create a label
		JLabel label = new JLabel("This is my first Applet.");
		setLayout(new FlowLayout());
		add(label);
	}

    // TODO overwrite start(), stop() and destroy() methods
}
