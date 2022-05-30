/** Exercise 7   
 * Write a recursive method named oddSum that takes a positive odd integer n and 
 * returns the sum of odd integers from 1 to n. Start with a base case, and use temporary variables 
 * to debug your solution. You might find it helpful to print the value of n each time oddSum is invoked.
 */

package Ch6;

public class oddSum 
{
	public static int oddSum(int n) {
	    if (n == 1) {
	        return 1;
	    } else {
	        return (n % 2 != 1) ? oddSum(n - 1) : oddSum(n - 1) + n;
	    }
	}
	
	
	public static void main(String[] args) 
	{
		int number = 5;
		System.out.println(oddSum(number));
	}
}



