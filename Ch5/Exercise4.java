/** Exercise 4 
 * Fermat’s Last Theorem says that there are no integers a, b, and c such that an + bn = cn, except when n ≤ 2.
 * 
 * Write a method named checkFermat that takes four integers as parameters – a, b, c and n – and checks to see if Fermat’s theorem holds. 
 * If n is greater than 2 and a^n + b^n = c^n, the program should display “Holy smokes, Fermat was wrong!” 
 * Otherwise the program should display “No, that doesn’t work.”
 *  
 * Hint: You may want to use Math.pow.
 **/

package Ch5;

import java.lang.Math;
import java.util.Scanner;

public class Exercise4 
{
	public static void checkFermat(int a, int b, int c, int n)
	{
		if (((Math.pow(a, n) + Math.pow(b, n)) == Math.pow(c, n)) && (n > 2)) 
		{
			System.out.println("Holy smokes, Fermat was wrong!");
		}
		else 
		{
			System.out.println("No, that doesn't work.");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a, b, c, n;
		System.out.print("Enter an integer for a: ");
		a = in.nextInt();
		System.out.print("Enter an integer for b: ");
		b = in.nextInt();
		System.out.print("Enter an integer for c: ");
		c = in.nextInt();
		System.out.print("Enter an integer for n: ");
		n = in.nextInt();
		
		checkFermat(a, b, c, n);
	}
}
