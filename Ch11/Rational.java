package Ch11;

public class Rational
{
    // Define a class called Rational. A Rational object should have two integer
    // instance variables that store the numerator and denominator.
    private int numerator;
    private int denominator;

    // Write a constructor that takes no arguments and sets the numerator
    // to 0 and denominator to 1.
    public Rational()
    {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Write a second constructor that takes two arguments and uses them to
    // initialize the instance variables.
    public Rational(int numerator, int demoninator)
    {
        this.numerator = numerator;
        this.denominator = demoninator;
    }
    // Write an instance method called printRational that displays a
    // Rational object in a reasonable format.
    // I had to create a toString function first.
    
    public String toString()
    {
	    return String.format("%01d/%01d\n", this.numerator, this.denominator);
    }
    
    public static void printRational(Rational rational)
    {
    	String s = rational.toString();
    	System.out.println(s);
    }

    // Write an instance method called negate that reverses the sign of a
    // rational number. This method should be a modifier, so it should be
    // void. Add lines to main to test the new method.
    public static void negate(Rational rational)
    {
    	rational.numerator = rational.numerator * -1;
    	rational.denominator = rational.denominator * -1;
    }


    // Write an instance method called invert that swaps the numerator
    // and denominator. It should be a modifier. Add lines to main to test the new method.
    public static void invert(Rational rational)
    {
        int swapN = rational.numerator;
        int swapD = rational.denominator;
        rational.numerator = swapD;
        rational.denominator = swapN;
    }

    // Write a method called toDouble that converts the rational number to a
    // double (floating-point number) and returns the result. This method
    // is a pure function; it does not modify the object.
	public static double toDouble(Rational rational)
	{
		double retDoub = (double)rational.numerator / (double)rational.denominator;
		return retDoub;
	}

    // Write a modifier named reduce that reduces a rational number
    // to its lowest terms
	public static void reduce(Rational rational)
	{
		int remain, num1, num2;
		num1 = rational.numerator;
		num2 = rational.denominator;
		remain = num1 % num2;

		while(remain != 0)
		{
			remain = num1 % num2 ;
			num1 = num2;
			num2 = remain;
		}
		int GCD = num1;

		Rational ret = new Rational(rational.numerator/GCD, rational.denominator/GCD);

		printRational(ret);
	}

	// Write a method called add that takes two Rational numbers as arguments and
  // returns a new Rational object. The return object should contain the sum of
  // the arguments.
	public static Rational add(Rational rational, Rational rationalAdd)
	{
		Rational retAdd = new Rational(0, 0);
		if(rational.denominator == rationalAdd.denominator) 
		{
			retAdd.numerator = rational.numerator + rationalAdd.numerator;
			retAdd.denominator = rational.denominator;
			return retAdd;
		} 
		else 
		{
			retAdd.numerator = rational.numerator * rationalAdd.denominator;
			retAdd.denominator = rational.denominator * rationalAdd.denominator;

			rationalAdd.numerator = rationalAdd.numerator * rational.denominator;
			rationalAdd.denominator = rationalAdd.denominator * rational.denominator;

			retAdd.numerator += rationalAdd.numerator;

			int remain, num1, num2;
			num1 = retAdd.numerator;
			num2 = retAdd.denominator;
			remain = num1 % num2;

			while(remain != 0)
			{
				remain = num1 % num2 ;
				num1 = num2;
				num2 = remain;
			}
			int GCD = num1;

			retAdd.numerator = retAdd.numerator/GCD;
			retAdd.denominator = retAdd.denominator/GCD;

			return retAdd;
		}
	}

    // Write a main method that creates a new object with type Rational,
    // sets its instance variables to the values of your choice, and
    // displays the object.
    public static void main(String[] args)
    {
        Rational rational = new Rational(1, 2);
        printRational(rational);
    }
}

