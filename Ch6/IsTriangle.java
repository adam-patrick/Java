/** Exercise 3  
 * If you are given three sticks, you may or may not be able to arrange them in a triangle. 
 * For example, if one of the sticks is 12 inches long and the other two are one inch long, 
 * you will not be able to get the short sticks to meet in the middle. 
 * For any three lengths, there is a simple test to see if it is possible to form a triangle:
 * 
 * If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.
 * 
 * Write a method named isTriangle that takes three integers as arguments and returns either true or false, 
 * depending on whether you can or cannot form a triangle from sticks with the given lengths. 
 * The point of this exercise is to use conditional statements to write a value method. 
 */


package Ch6;

import java.util.Scanner;
import java.lang.Math;

public class IsTriangle 
{
	public static boolean isTriangle(int a, int b, int c)
	{
		if ( Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		int a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value for a: ");
		a = in.nextInt();
		System.out.print("Enter a value for b: ");
		b = in.nextInt();
		System.out.print("Enter a value for c: ");
		c = in.nextInt();
		
		System.out.println(isTriangle(a, b, c));
	}
}
