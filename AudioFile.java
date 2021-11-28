package ch14java6thedition;

/**
 * This class demonstrates playing an audio file.
 * @author craig
 */
import java.applet.*;
import javax.swing.*;
import java.io.*;
public class AudioFile extends JApplet {

	@Override
	public void init() {

		String fileName = "/home/craig/"
			        + "NetBeansProjects/Ch14Java6thEdition/"
			        + "src/ch14java6thedition/pig_squeal.wav";

		AudioClip sound;
		sound = getAudioClip(null, fileName);
		sound.play();
			
	}

}
