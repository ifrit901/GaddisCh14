package ch14java6thedition;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author craig
 */
public class TimerTest {
	
	int secondsPassed = 0;

	Timer myTimer = new Timer();
	TimerTask task = new TimerTask() {
		public void run() {
			secondsPassed++;
			System.out.println("Seconds passed: " + secondsPassed);
		}
	};

	public void start() {
		while(secondsPassed > 11) {
			myTimer.scheduleAtFixedRate(task, 1000, 1000);

		}
	}

	public static void main(String[]args) {
		TimerTest timerTest = new TimerTest();
		timerTest.start();
	}
}
