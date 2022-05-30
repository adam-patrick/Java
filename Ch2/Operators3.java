package Ch2;

public class Operators3 
{
	public static void main(String[] args)
	{
		int hour = 11;
		int minute = 59;
		System.out.print("Number of minutes since midnight: ");
		System.out.println(hour * 60 + minute);   // works from left to right
		System.out.print("Fraction of the hour that has passed: ");
		System.out.println(minute / 60);
		System.out.print("Percent of the hour that has passed: ");
		System.out.print(minute * 100 / 60);
	}
}
