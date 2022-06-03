package Ch7;

public class sieve 
{
	public static void sieve (int[] a)
	{
		boolean arr[] = new boolean[] {false};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 2; j < i; j++)
			{
				if (i % j == 0)
				{
					arr[i] = true;
				}
				else
				{
					arr[i] = false;
				}
			System.out.println(arr[i]);
			}	
		}
	}
}
