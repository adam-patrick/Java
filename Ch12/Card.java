package Ch12;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Card 
{
	// Class variables are often used to store constant values that are needed in several places. 
	// In that case, they should also be declared as final. Note that whether a variable is static or final involves two separate considerations: 
	// static means the variable is shared, and final means the variable (or in this case, the reference) is constant.
	public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	// a fool might come along later and add a modifier. 
	// We can prevent that possibility by declaring the instance variables final:
	private final int rank;
    private final int suit;
    private static Image[][] images;
	
	public Card(int rank, int suit)
	{
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString() 
	{
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
	
	public boolean equals(Card that)
	{
		return this.rank == that.rank && this.suit == that.suit;
	}
	
	// compareTo returns -1 if this is a lower card, +1 if this is a higher card, and 0 if this and that are equivalent. 
	// It compares suits first. If the suits are the same, it compares ranks. If the ranks are also the same, it returns 0.
	public int compareTo(Card that)
	{
	      if (this.suit < that.suit)
	      {
	         return -1;
	      }
	      if (this.suit > that.suit)
	      {
	         return 1;
	      }
	      if (this.rank < that.rank)
	      {
	         if (this.rank == 1) 
	         {
	            return 1;
	         } 
	         else 
	         {
	            return -1;
	         }
	      }
	      if (this.rank > that.rank)
	      {
	         if (that.rank == 1) 
	         {
	            return -1;
	         } 
	         else 
	         {
	            return 1;
	         }
	      }
	      return 0;
	   }
	
	
	public int getRank()
	{
	   return this.rank;
	}
	public int getSuit()
	{
	   return this.suit;
	}
	
	// Encapsulate the deck-building code from Section 12.6 in a method called makeDeck 
	// that takes no parameters and returns a fully populated array of Cards.
	public static void makeDeck()
	{
		Card[] cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) 
		{
		    for (int rank = 1; rank <= 13; rank++) 
		    {
		        cards[index] = new Card(rank, suit);
		        index++;
		    }
		}
	}
	
	// When you work with arrays, it is convenient to have a method that displays the contents.
	public static void printDeck(Card[] cards) 
	{
		for (Card card : cards) 
		{
			System.out.println(card);
		}
    }
	
	// takes an array of cards and a Card object as parameters. 
	// It returns the index where the Card appears in the array, or -1 if it doesn’t.
	public static int search(Card[] cards, Card target) 
	{
		for (int i = 0; i < cards.length; i++) 
		{
			if (cards[i].equals(target)) 
			{
				return i;
			}
		}
		return -1;
	}
	

	public static int binarySearch(Card[] cards, Card target) 
	{
		int low = 0;
		int high = cards.length - 1;
		while (low <= high) 
		{
			int mid = (low + high) / 2;                 // step 1
			int comp = cards[mid].compareTo(target);

			if (comp == 0) 
			{                            // step 2
				return mid;
			} 
			else if (comp < 0) 
			{                      // step 3
				low = mid + 1;
			} 
			else 
			{                                    // step 4
            high = mid - 1;
			}
		}
		return -1;
	}
	
	public static int[] suitHist(Card[] cards)
	{
	      int[] result = new int[4];
	      for (Card card:cards)
	      {
	         result[card.getSuit()] += 1;
	      }
	      return result;
	   }
	public static boolean hasFlush(Card[] cards)
	{
	   for (int count:suitHist(cards))
	   {
	      if (count >= 5)
	      {
	         return true;
	      }
	   }
	   return false;
	}
	
	public static void main(String[] args)
	{
		images = new Image[14][4];

		String cardset = "cardset-oxymoron";
		String suits = "cdhs";

		for (int suit = 0; suit <= 3; suit++) 
		{
			char c = suits.charAt(suit);

			for (int rank = 1; rank <= 13; rank++) 
			{
				String s = String.format("%s/%02d%c.gif",
                                 cardset, rank, c);
				images[rank][suit] = new ImageIcon(s).getImage();
			}
		}
	}
}

