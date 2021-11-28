package ch14java6thedition;
import javax.swing.*;
/**
 *
 * @author craig
 */
public class DrawingTester {

	public static void main(String[]args) {
		int w = 640;
		int h = 480;
		JFrame frame = new JFrame();
		DrawingCanvas d = new DrawingCanvas(w,h);
		frame.setSize(w, h);
		frame.setTitle("Drawing in Java");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(d);
		frame.setVisible(true);
	}
	
}
