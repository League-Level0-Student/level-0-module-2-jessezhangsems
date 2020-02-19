package _15_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input=JOptionPane.showInputDialog("Ah ya. I got fired at my old job. Anyway, How old are you? ");
int num=Integer.parseInt(input);
if (num>=18) {
	JOptionPane.showInputDialog("Okay. What foodleflicking corrupt man do you want to destroy our country?");
	
}
else if (num<18) {
	JOptionPane.showMessageDialog(null, "Game over. You got spanked to death by a former amusement park worker.");
	
}
	}

}
