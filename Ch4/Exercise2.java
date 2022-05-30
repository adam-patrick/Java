/** Exercise 2 
 * The point of this exercise is to make sure you understand how to write and invoke methods that take parameters.
 * 1) Write the first line of a method named zool that takes three parameters: an int and two Strings.
 * 2) Write a line of code that calls zool, passing as arguments the value 11, 
 * 		the name of your first pet, and the name of the street you grew up on. 
 */

package Ch4;

public class Exercise2 
{
	public static void zool(int value, String petname, String street)
	{
		System.out.print("Value: ");
		System.out.println(value);
		System.out.print("Pet Name: ");
		System.out.println(petname);
		System.out.print("Street You Grew Up On: ");
		System.out.println(street);
	}
	
	public static void main(String[] args)
	{
		int value = 11;
		String petname = "Mocha";
		String street = "Rice Mine Road";
		zool(value, petname, street);
	}
}
