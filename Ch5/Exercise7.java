package Ch5;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Exercise7 
{
	public static void main(String[] args) 
	{
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;
        Scanner in = new Scanner(System.in);
        
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.println("Type a number: ");
        guess = in.nextInt();
        System.out.print("Your guess is ");
        System.out.println(guess);
        
        while (guess != number)
        {
        	if (number > guess)
        	{
        		System.out.println("Too Low.");
        	}
        	else if (number < guess)
        	{
        		System.out.println("Too High.");
        	}
        	System.out.println("Type a number: ");
            guess = in.nextInt();
            System.out.print("Your guess is ");
            System.out.println(guess);
        }
        System.out.println("Correct! Good Job!!!");
	}
}
