// Exercise 6  
// Write a program named Quadratic.java that finds the roots of 
// ax2 + bx + c = 0 using the quadratic formula:

// Prompt the user to input integers for a, b, and c. 
// Compute the two solutions for x, and display the results.

// Your program should be able to handle inputs for which there is only 
// one or no solution. Specifically, it should not divide by zero 
// or take the square root of a negative number.

// Be sure to validate all inputs. The user should never see an input mismatch
// exception. Display specific error messages that include the invalid input.

import java.util.Scanner;
import java.lang.Math;

class HelloWorld {
    public static void quadratic(int a, int b, int c)
    {
        if (a == 0 || b == 0 || c == 0)
        {
            System.out.println("No zeros.");
        }
        else if (a < 0 || b < 0 || c < 0)
        {
            System.out.println("No negatives.");
        }
        else
        {
            int quad1 = ((int)Math.pow(b, 2) - (4 * a * c));
            int quad2a = (-b + quad1) / (2 * a);
            int quad2b = (-b - quad1) / (2 * a);
            System.out.println("The solutions are " + quad2a + " and " + quad2b);
        }
    }
    public static void main(String[] args)
    {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer for a: ");
        a = in.nextInt();
        System.out.print("Enter an integer for b: ");
        b = in.nextInt();
        System.out.print("Enter an integer for c: ");
        c = in.nextInt();
        quadratic(a, b, c);
    }
}