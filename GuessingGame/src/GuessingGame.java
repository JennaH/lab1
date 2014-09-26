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
		while(guessed == false)
		{
			if(guess == number)
			{
				System.out.println("You guessed right!");
				guessed = true;
			}
			else
			{
				System.out.println("Sorry, your guess was incorrect. Guess again.");
				guess = scan.nextInt();
			}
		}
	}

}