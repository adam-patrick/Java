package Ch11;

//Write a class definition for Date, an object type that contains three
//integers: year, month, and day. This class should provide two constructors.
//The first should take no parameters and initialize a default date.
//The second should take parameters named year, month and day, and use them
//to initialize the instance variables.

class Date
{
 private int year;
 private int month;
 private int day;

 public Date()
 {
     this.year = 1900;
     this.month = 01;
     this.day = 01;
 }

 public Date(int year, int month, int day)
 {
     this.year = year;
     this.month = month;
     this.day = day;
 }

 // Write a main method that creates a new Date object named birthday.
 // The new object should contain your birth date. You can use either
 // constructor.
 public static void main (String[] args)
 {
     Date date = new Date(1986, 9, 12);
     System.out.println("My birthday is " + date.month + "/" + date.day + "/" + date.year + ".");
 }
}

