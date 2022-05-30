/** Exercise 2  
 * Write a method named isDivisible that takes two integers, n and m, 
 * and that returns true if n is divisible by m, and false otherwise.
 */


package Ch6;

import java.util.Scanner;

public class IsDivisible 
{
	public static boolean isdivisible(int n, int m)
	{
		if (n % m == 0)
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
		int n, m;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer for n: ");
		n = in.nextInt();
		System.out.print("Enter an integer for m: ");
		m = in.nextInt();
		System.out.print(isdivisible(n, m));
	}
}
