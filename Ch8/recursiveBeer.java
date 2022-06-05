package Ch8;

public class recursiveBeer 
{
	public static void recursiveBeer(int n)
	{
		while (n > 0)
		{
			System.out.print(n + " bottles of beer on the wall,\n");
			System.out.print(n + " bottles of beer\n");
			System.out.print("ya’ take one down, ya’ pass it around,\n");
			n--;
			System.out.print(n + " bottles of beer on the wall.\n");
		}
		System.out.print("No bottles of beer on the wall,\r\n"
				+ "no bottles of beer,\r\n"
				+ "ya’ can’t take one down, ya’ can’t pass it around,\r\n"
				+ "’cause there are no more bottles of beer on the wall!");
	}
	
	public static void main(String[] args)
	{
		recursiveBeer(3);
	}
}
