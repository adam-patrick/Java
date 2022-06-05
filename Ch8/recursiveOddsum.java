package Ch8;

public class recursiveOddsum 
{
	public static int oddSum(int x) 
	{
	    if (x == 1)
	    {
	    	return 1; // base case
	    }
	    else if (x == 0)
	    {
	    	return 0;
	    }
	    else if (x % 2 == 0)
	    {
	    	System.out.println("Odd integers only!");
	    	System.exit(0);
	    }
	    return x + oddSum(x - 2);  // recursive case
	}
	
	public static void main (String[] args)
	{
		System.out.print(oddSum(4));
	}
}
