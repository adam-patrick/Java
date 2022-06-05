package Ch8;

public class ackerman 
{
	public static int ackerman(int m, int n)
	{
		if (m == 0)
		{
			return n + 1;
		}
		else if (m > 0 && n == 0)
		{
			return ackerman(m - 1, 1);
		}
		else if (m > 0 && n > 0)
		{
			return ackerman(m - 1, ackerman(m, n - 1));
		}
		else
		{
			return 0;  // since function errors out, if none of the
					   // conditions are true, return 0.
		}
	}
	
	public static void main (String[] args)
	{
		System.out.print(ackerman(3, 3));  // test
	}
}
