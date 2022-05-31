// Exercise 5  

// A word is said to be a “doubloon” if every letter that appears in the 
// word appears exactly twice. Here are some example doubloons found in 
// the dictionary:

// Abba, Anna, appall, appearer, appeases, arraigning, beriberi, bilabial, 
// boob, Caucasus, coco, Dada, deed, Emmett, Hannah, horseshoer, intestines,
// Isis, mama, Mimi, murmur, noon, Otto, papa, peep, reappear, redder, 
// sees, Shanghaiings, Toto

// Write a method called isDoubloon that takes a string and checks 
// whether it is a doubloon. To ignore case, invoke the toLowerCase 
// method before checking.

import java.util.Scanner;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.function.Function;

class isDoubloon 
{
    public static boolean isDoubloon(String str) {
    long distinct = str.chars().distinct().count();
    long length = str.length();

    return (length % 2 == 0 && length / 2 == distinct);
}

    
    public static void main(String[] args)
    {
        String word, lowerword;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a word to check if it's a doubloon: ");
        word = in.nextLine();
        lowerword = word.toLowerCase();
        System.out.println(isDoubloon(lowerword));
    }
}