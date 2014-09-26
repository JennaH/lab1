import java.util.Scanner;
public class GuessingGame
{
	public static void main(String args[])
	{
		int number = (int)(Math.random() * 9 + 1);
		System.out.println("Guess a number between 0 and 10");
		Scanner scan = new Scanner(System.in);
		int guess = scan.nextInt();
		boolean guessed = false;
		int attempts = 0;
		while(guessed == false)
		{
			if(guess == number)
			{
				System.out.println("You guessed right!");
				guessed = true;
				attempts++;
			}
			else
			{
				System.out.println("Sorry, your guess was incorrect. Guess again.");
				attempts++;
				guess = scan.nextInt();
			}
		}
		System.out.println("Number of guesses: " + attempts);
	}

}