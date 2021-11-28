package ch14java6thedition;

/**
 *
 * @author craig
 */
import javax.swing.*;
import java.awt.*;
public class PanelComponent extends JPanel{
	
	JPanel panel;
	JFrame frame;
	JLabel label;

	public PanelComponent () {
		frame = new JFrame();
		frame.setTitle("New Panel");
		frame.setSize(400, 400);
		frame.setLocation(400, 250);


		panel = new JPanel();
		label = new JLabel("New Label");
		panel.add(label);
		frame.add(panel);

		frame.pack();
		frame.setVisible(true);

	}
	public void paintComponent(Graphics g) {

		panel.paint(g);
		
	}
	public static void main(String[]args) {
		new PanelComponent();
	}
}
