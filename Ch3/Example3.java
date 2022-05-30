/**Exercise 3 - Write a program that converts a total number of seconds to hours, minutes, and seconds. 
 * It should (1) prompt the user for input, (2) read an integer from the keyboard, 
 * (3) calculate the result, and (4) use printf to display the output. 
 * For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds". 
 * Hint: Use the modulus operator.
 */

package Ch3;

import java.util.Scanner;

public class Example3 
{
	public static void main (String[] args)
	{
		int userseconds;
		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MINUTE = 60;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of seconds to convert to hours, minutes, and seconds: ");
		userseconds = in.nextInt();
		
		int hours = userseconds / SECONDS_IN_HOUR;
		int minutes = (userseconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
		int seconds = userseconds % SECONDS_IN_MINUTE;
		System.out.printf("%d seconds = %02d hours, %02d minutes, and %02d seconds", userseconds, hours, minutes, seconds);
	}
}
