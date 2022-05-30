package Ch4;

public class PrintTime 
{
	public static void printTime(int hour, int minute)
	{
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
	}
	
	public static void main(String[] args)
	{
		int hour = 11;
		int minute = 59;
		printTime(hour, minute);
	}
}
