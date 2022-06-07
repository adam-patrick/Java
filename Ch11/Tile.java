package Ch11;

//Write a definition for a class named Tile that represents Scrabble tiles.
//The instance variables should include a character named letter and
//an integer named value.
public class Tile
{
	char letter;
	int value;

 // Write a constructor that takes parameters named letter and value, and initializes the instance variables.
	public Tile(char letter, int value)
	{
		this.letter = letter;
		this.value = value;
	}

 // Write a method named printTile that takes a Tile object as a parameter and displays the instance variables in a reader-friendly format.
 public static void printTile(Tile tile)
 {
		System.out.println("The tile " + tile.letter + " has the score of " + tile.value + ".");
	}

 // Create getters and setters for each of the attributes.
 public char getLetter()
 {
     return this.letter;
 }

 public int getValue()
 {
     return this.value;
 }

 public void setLetter(char letter)
 {
     this.letter = letter;
 }

 public void setValue(int value)
 {
     this.value = value;
 }

 // Implement the toString and equals methods for a Tile.
 public boolean equals(Tile that)
 {
     return this.letter == that.letter && this.value == that.value;
 }

	  public String toString()
	    {
		    return String.format("%c, %02d\n", this.letter, this.value);
	    }

	  // Write a main method that creates a Tile object with the letter Z and the
 // value 10, and then uses printTile to display the state of the object.
	  public static void main(String[] args)
	    {
		    Tile tile = new Tile('z', 10);
		    printTile(tile);
	    }
}

