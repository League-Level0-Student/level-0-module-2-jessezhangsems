package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {
public static void main(String[] args) {
	Random ran= new Random();
	int num =ran.nextInt(6);
	int numb =ran.nextInt(6);
	int numbe =ran.nextInt(6);
	int number =ran.nextInt(6);
	int nu=ran.nextInt(6);
	JOptionPane.showMessageDialog(null, num+" " +numb +" "+numbe +" "+number +" "+nu);
	
	
}
	
	
	
}
