//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		if (randomNumber==0) {
		JOptionPane.showMessageDialog(null, "You are an amazing person and you have great possibilities in life. Remember: The stars can't shine until it's really, really dark. ");
		}
		else if (randomNumber==1) {
JOptionPane.showMessageDialog(null, "You are an extremely intelligent person. You will become the next Bill Gates, I just know it. ");
			
		}
		else if (randomNumber==2) {		// 2. Repeat all the code above 10 times
		JOptionPane.showMessageDialog(null, "You are so nice, I bet your friends can't imagine a better person than you. ");
		
		}
		
		else if (randomNumber==3) {
	JOptionPane.showMessageDialog(null, "You are stronger than you think. You are smarter than you think. If someone doesn't agrees, they are just being very jealous and trying to bring you down. ");
	
		}
		else if(randomNumber==4) {
			JOptionPane.showMessageDialog(null, "I would trust you with my phone password. That's how trustable you are. Is that even a word?");
		}
		 

}
}