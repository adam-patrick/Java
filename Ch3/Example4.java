/** Exercise 4   The goal of this exercise is to program a “Guess My Number” game. 
 * When it’s finished, it will work like this:
 * 
 * I'm thinking of a number between 1 and 100
 * (including both). Can you guess what it is?
 * Type a number: 45
 * Your guess is: 45
 * The number I was thinking of is: 14
 * You were off by: 31
 */

package Ch3;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Example4 
{
	public static void main(String[] args) 
	{
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;
        int numberoff;
        Scanner in = new Scanner(System.in);
        
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.println("Type a number: ");
        guess = in.nextInt();
        System.out.print("Your guess is ");
        System.out.println(guess);
        System.out.print("The number I was thinking of was ");
        System.out.println(number);
        numberoff = guess - number;
        int value = Math.abs(numberoff);   // use a Math function to make sure the value is never negative.
        System.out.print("You were off by ");
        System.out.println(value);
	}
}
