//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	
public static void main(String[] args) {
	Random ran= new Random();
	int num= ran.nextInt(4);
	JOptionPane.showInputDialog("I am the Magic 8 Ball. Ask me a question. ");
	if (num==0) {
		JOptionPane.showMessageDialog(null, "Yes");
	}
	else if(num==1) {
		JOptionPane.showMessageDialog(null, "No");
	}
	else if(num==2) {
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	}
	else if(num==3) {
		JOptionPane.showMessageDialog(null, "Yes, you will accidentally eat your own underwear. Or did you typo? That happens to come up when that happens. ");
	}
}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
