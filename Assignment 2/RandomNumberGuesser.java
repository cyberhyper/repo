package assignment2;

import java.util.Scanner;

public class RandomNumberGuesser 
{

	public static void main(String[] args) 
	{
		
		//Setting up Scanner for user input
		Scanner input = new Scanner(System.in);
	
		int highGuess = 100;
		int lowGuess = 0;
		int nextGuess;
		String again;
		int randNum = RNG.rand();;
		
		System.out.println("Hello User! Welcome to the Random Number Guesser!");
		System.out.println("A number has been chosen between 0 and 100! Good luck!");
		
		do
		{
		//testing will delete later
				System.out.println("Secret number, will delete when submitting: " + randNum);
		
		System.out.println("Please enter your first guess: ");
		
			do
			{	
				nextGuess = input.nextInt();
			
				if(nextGuess > randNum)
				{

					RNG.inputValidation(nextGuess, lowGuess, highGuess);
					
					highGuess = nextGuess;
				
					System.out.println("Number of guesses is " + RNG.getCount());
					System.out.println("Your guess was too high.");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess + ".");
			
				}
			
				else if(nextGuess < randNum)		
				{

					RNG.inputValidation(nextGuess, lowGuess, highGuess);
					
					lowGuess = nextGuess;
					
					System.out.println("Number of guesses is " + RNG.getCount());
					System.out.println("Your guess was too low.");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess + ".");
				}
				else if(nextGuess == randNum)
				{
					System.out.println("Congratulations, you've guessed correctly!");
					System.out.println("You have used " + RNG.getCount() + " guesses.");
				}
		
			}while(nextGuess != randNum);
		
		System.out.println("Would you like to play again?(yes/no)");
		again = input.next();
		
		RNG.resetCount();
		randNum = RNG.rand();
		lowGuess = 0;
		highGuess = 100;
		
		}while(again.equals("yes"));
	
		System.out.println("Thanks for playing!");
	}
}
