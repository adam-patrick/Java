package Ch3;

public class typecastoperators 
{
	public static void main(String[] args)
	{
		int inch = 100;
		final double CM_PER_INCH = 2.54;  // page 33
		double cm = inch * CM_PER_INCH;
		double pi = 3.14159;
		double x = (int) pi * 20; // result is 60.0, not 62.0
		inch = (int) (cm / CM_PER_INCH);
		System.out.printf("%f cm = %d in\n", cm, inch);
	}
}
