package Ch8;

import java.util.Scanner;

public class isPalindromeRecursive 
{
	public static boolean isPalindrome(String s)
	{
		
		if (s.length() == 0 || s.length() == 1) // if string has one or none characters
		{
			return true;
		}
		else
		{
			if (s.charAt(0) == s.charAt(s.length() - 1))
			{
				return isPalindrome(s.substring(1, s.length() - 1));
			}
			
			else
			{
				return false;  // java required else function
			}
		}
		
	}
	
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter the String for check:");
        	String s = scanner.nextLine();
        	/* If function returns true then the string is
         	* palindrome else not
         	*/
        	if(isPalindrome(s))
		{
            		System.out.println(s + " is a palindrome");
		}
		else
		{
            		System.out.println(s + " is not a palindrome");
		}
	}
}
