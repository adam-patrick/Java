/** Exercise 4  
 * 
 * Many computations can be expressed more concisely using the “multadd” operation, 
 * which takes three operands and computes a * b + c. Some processors even provide a hardware implementation 
 * of this operation for floating-point numbers.
 * 
 * Create a new program called Multadd.java.
 * Write a method called multadd that takes three doubles as parameters and that returns a * b + c.
 * Write a main method that tests multadd by invoking it with a few simple parameters, like 1.0, 2.0, 3.0.
 * 
 * Also in main, use multadd to compute the following values:
 * sin (π / 4) + (cos (π / 4) / 2)
 * 
 * log10 + log20
 * 
 * Write a method called expSum that takes a double as a parameter and that uses multadd to calculate:
 * x(e^−x +	√(1 - e^-x)
 * Hint: The method for raising e to a power is Math.exp.
 * 
 * In the last part of this exercise, you need to write a method that invokes another method you wrote. 
 * Whenever you do that, it is a good idea to test the first method carefully before working on the second. 
 * Otherwise, you might find yourself debugging two methods at the same time, which can be difficult.
 * 
 * One of the purposes of this exercise is to practice pattern-matching: the ability to recognize a specific 
 * problem as an instance of a general category of problems.
 *  
 */


package Ch6;

import java.lang.Math;

public class Multadd 
{
	public static double multadd(double a, double b, double c)
	{
		return a * b + c;
	}
	
	public static void main(String[] args)
	{
		double a = 1.0;
		double b = 2.0;
		double c = 3.0;
		System.out.println(multadd(a, b, c));
		
		double a1 = Math.cos(Math.PI/4.0);
		double b1 = 1.0/2.0;
		double c1 = Math.sin(Math.PI/4.0);
		System.out.print ("sin(pi/4) + cos(pi/4)/2 = ");
		multadd (a1, b1, c1);
		System.out.println();
		
		double a2 = 1.0;
		double b2 = Math.log(10);
		double c2 = Math.log(20);
		System.out.print("log(10) + log(20) = ");
		multadd(a2, b2, c2);
	}
}
