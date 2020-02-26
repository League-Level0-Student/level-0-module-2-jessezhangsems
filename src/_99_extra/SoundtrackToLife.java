//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _99_extra;

import java.net.URI;
import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What mood are you in?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] {  "I'm happy because I am a proud anti-vaxxer.", "I'm sad because of anti-vaxxers","I'm angry because of anti-vaxxers","I'm stressed because of anti-vaxxers" }, null);
		if (userMood==0) {
			playVideo("https://www.youtube.com/watch?v=nDjz5qHIzsc");
			playVideo("https://www.youtube.com/watch?v=b03U6BYF9L0");
			
		}
		// 2. Their answer is stored in the userMood variable. Print it out.
if(userMood==1) {
	playVideo("https://www.youtube.com/watch?v=JxJsai5nkGI");
}
if(userMood==2) {
	playVideo("https://www.youtube.com/watch?v=BoGHOYom1sc");
}
if (userMood==3) {
	playVideo("https://www.youtube.com/watch?v=X5lxDzK9sRA");
	
}
	

/**
* If you can’t think of any, here are some you can use...
*	http://bit.ly/video-for-happy
*	http://bit.ly/video-for-sad
*	http://bit.ly/video-for-angry
**/
		
		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



