//GuessMe
//Logic game: Generates a number between 1-100
//prompts user to guess it
//informs user whether guess is within 20

package GuessMe;

import javax.swing.*;
import java.util.Random;

public class GuessMe
{
	public static void main ( String[] args )
	{
		//generate a random number
		Random r = new Random();
		int chosen = r.nextInt(100);
		System.out.println("chosen = " + chosen);
		
		//prompt user to guess number
		int guess = 0;
		guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number from 1-100"));
		System.out.println("guess = " + guess);
		int guessCount = 0; //iterator for number of guesses
		//if the guess isn't right...
		while(guess != chosen)
		{
			//determine whether the guess is within 20 and tell the user
			if(guess + 20 >= chosen && guess - 20 <= chosen && guess != chosen)
			{
				guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Your guess was within 20 of my number!\nGuess again!"));
				System.out.println("guess = " + guess);
			}
			if(guess + 20 < chosen || guess - 20 > chosen)
			{
				guess = Integer.parseInt(JOptionPane.showInputDialog(null, "Your guess was not within 20 of my number!\nGuess again!"));
				System.out.println("guess = " + guess);
			}
			guessCount += 1;
		}
		//if it is right, tell the user and inform them how many guesses they took.
		JOptionPane.showMessageDialog(null, "Your guess was correct!\nIt took you "
											 + guessCount + 
											" guesses to find my number!");
	}
}