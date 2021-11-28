package ch14java6thedition;

/**
 * This class tests the methods associated with
 * the MouseListener interface.
 * 
 * @author craig
 * 10-4-21
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MouseTester extends JFrame {
	
	private int x;
	private int y;
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JPanel labelPanel = new JPanel();

	public MouseTester() {

		setTitle("Mouse movement detector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500, 250);
		panel.addMouseMotionListener(new MouseMovementListener());
		panel.addMouseListener(new MouseRegularListener());
		panel.setPreferredSize(new Dimension(400, 400));
		label.setAlignmentX(SwingConstants.CENTER);
		label.setFont(new Font("Sans Serif", Font.BOLD, 20));
		labelPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
		labelPanel.add(label);
		add(panel, BorderLayout.CENTER);
		add(labelPanel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	private class MouseRegularListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			label.setText("Mouse is pressed.");

		}
		public void mouseClicked(MouseEvent e) {
			label.setText("Mouse is clicked.");
		}
		public void mouseReleased(MouseEvent e) {
			label.setText("Mouse is released.");
		}
		public void mouseEntered(MouseEvent e) {


		}
		public void mouseExited(MouseEvent e) {
			
		}
	}
	private class MouseMovementListener implements MouseMotionListener {

		public void mouseDragged(MouseEvent e) {
			label.setText("Mouse is dragged.");
		}
		public void mouseMoved(MouseEvent e) {
			label.setText("X = " + e.getX() + "   " + "Y = " + e.getY());

		}
		

	}
	public static void main(String[]args) {
		new MouseTester();
	}
}

