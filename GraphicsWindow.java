package ch14java6thedition;

/**
 * This applet uses a JPanel and the overriden
 * paintComponent method instead of overriding
 * paint.
 * 
 * @author craig
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GraphicsWindow extends JApplet {
	
	// Declare an array of checkBoxes
	JCheckBox [] checkBoxes;

	// Create an array of Strings to name the checkboxes
	String [] boxNames = {"Line", "Rectangle", "Filled Rectangle", "Oval", 
			   "Filled Oval", "Arc", "Filled Arc"};
	// Create a JPanel to contain the checkBoxes
	JPanel checkBoxPanel;

	// The following will reference an instance of the drawingPanel class
	private DrawingPanel drawingPanel;

	/**
	 * init method.
	 */
	public void init() {

		// Build the check box panel
		buildCheckBoxPanel();

		// Create the drawing panel
		drawingPanel = new DrawingPanel(checkBoxes);

		// Add the check box panel to the east region
		// and the drawing panel to the center region
		add(checkBoxPanel, BorderLayout.EAST);
		add(drawingPanel, BorderLayout.CENTER);

	}
	/**
	 * The buildCheckBoxPanel method creates the array of 
	 * check box components and adds them to a panel.
	 */
	public void buildCheckBoxPanel() {

		// Create the panel
		checkBoxPanel = new JPanel();
		checkBoxPanel.setLayout(new GridLayout(7, 1));

		// Create the check box array
		checkBoxes = new JCheckBox[7];

		// Create the check boxes and add them to the panel
		for (int i = 0; i < checkBoxes.length; i++) {
			checkBoxes[i] = new JCheckBox(boxNames[i]);
			checkBoxes[i].addItemListener(new CheckBoxListener());
			checkBoxPanel.add(checkBoxes[i]);
		}
	}

	/**
	 * Private inner class to handle state changes in the check boxes.
	 */
	private class CheckBoxListener implements ItemListener {

		public void itemStateChanged(ItemEvent e) {
			drawingPanel.repaint();
		}

	}
	
}
