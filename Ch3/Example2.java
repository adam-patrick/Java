/** Write a program that converts a temperature from Celsius to Fahrenheit. 
 * It should (1) prompt the user for input, (2) read a double value from the keyboard, 
 * (3) calculate the result, and (4) format the output to one decimal place. 
 * For example, it should display "24.0 C = 75.2 F". Here is the formula. Be careful not to use integer division!
 * F = C × 9/5 + 32  
 */

package Ch3;

import java.util.Scanner;

public class Example2 
{
	public static void main (String[] args)
	{
		double celsius;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the degrees in Celsius you wish to convert: ");
		celsius = in.nextDouble();
		final double fahrenheit = (celsius * 9 / 5) + 32;
		System.out.printf("%.1f celsius = %.1f fahrenheit\n", celsius, fahrenheit);
	}
}
