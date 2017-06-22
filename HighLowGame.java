 import java.util.Random;

import javax.swing.JOptionPane;
 
// Copyright Wintriss Technical Schools 2013
public class HighLowGame {
 
	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		Boolean win = false;
		for(int i = 0; i < 10; i++){
			// 1. ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("Try to guess the number");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int numberGuess = (Integer.parseInt(guess));
			// 5. if the guess is correct
			if(numberGuess == random){
				win = true;
				break;
			} else if(numberGuess > random){
				JOptionPane.showMessageDialog(null, "Too high.");
			} else if(numberGuess < random){
				JOptionPane.showMessageDialog(null, "Too low.");
			}
				// 10. tell them it's too low
		}
		// 12. tell them they lose
		if(win){
			JOptionPane.showMessageDialog(null, "You win");	
		} else {
			JOptionPane.showMessageDialog(null, "You lose");
		}
		
	}
 
}
 
 
