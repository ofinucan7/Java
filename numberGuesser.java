import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class numberGuesser {
	public static void main(String args[]){
		
		Scanner keyboard = new Scanner(System.in); //keyboard
		
		//constants
		final int min = 0; //establishes the minimum value for the random number
		final int max = 50; //establishes maximum value for the random number
		
		//public variables
		int rand = ThreadLocalRandom.current().nextInt(min, max + 1); //picks random number for user to guess
		int guess; //Recieves the user's guess of the number
		int lives = 5; //Allows for the user to have 5 guesses
		boolean alive = true;//controls when the game is over
		
		//starts the game
		System.out.println("Welcome to number guesser. To begin, guess a number 0-50.");
		guess = keyboard.nextInt();
		
		while (lives > 0 && alive == true) { //when the lives is a positive number and the boolean alive is true, the game will run
			
			if (guess == rand) {
				System.out.println("Congrats! You guessed the number! It took you "+ (6-lives) + " guesses!"); //tells the user how many guesses it took to guess the number
				alive = false;
			} else if (guess > rand && lives > 0) { //if the guess was too high, tells user that, takes away a life, then promps user for another entry
				System.out.println("Too high! Guess a lower numbner.");
				lives = lives - 1;
				guess = keyboard.nextInt(); 
			} else if (guess < rand && lives > 0) { //if the guess was too low, tells user that, takes away a life, then promps user for another entry
				System.out.println("Too low! Guess a higher number.");
				lives = lives - 1;
				guess = keyboard.nextInt();
			} else if (lives == 0) { //if the user runs out of lives, it tells them what the number was
				System.out.println("Sorry, the correct number was " + rand + ".");
				alive = false;
			}		
			}
			
	}
	}