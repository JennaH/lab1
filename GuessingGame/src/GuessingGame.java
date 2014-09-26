import java.util.Scanner;
public class GuessingGame
{
	public static void main(String args[])
	{
		int number = (int)(Math.random() * 9 + 1);
		System.out.println("Guess a number between 0 and 10");
		Scanner scan = new Scanner(System.in);
		int guess = scan.nextInt();
		if(guess == number)
		{
			System.out.println("Your guess was correct!");
		}
		else
		{
			System.out.println("Your guess was incorrect. The number was " + number);
		}
	}

}