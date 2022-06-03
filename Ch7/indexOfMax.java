package Ch7;

public class indexOfMax 
{
	
	public static int indexofMax(int[] a)
	{
		int high = 0;
		for (int i = 0; i < a.length; i++)
		{
			high = i;
			for (int j = 0; j < a.length; j++)
			{
				if (j > high)
				{
					high = j;
				}
			}
		}
		return high;
	}
}
