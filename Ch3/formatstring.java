package Ch3;

import java.util.Scanner;

public class formatstring 
{
	public static void main(String[] args)
	{
		int inch = 100;
		final double CM_PER_INCH = 2.54;  // page 33
		double cm = inch * CM_PER_INCH;
		System.out.printf("%d in = %f cm\n", inch, cm);
	}
}
