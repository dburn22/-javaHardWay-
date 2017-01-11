import java.util.Scanner;

public class Weasel  {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		boolean yep, nope;
		
		System.out.println( "Type the word \"weasel\", please. " );
		word = keyboard.next();
		
		yep = word("weasel").equals; 
		//By putting the word weasel in front of the dot it did not work//
		nope = ! word.equals("weasel");
		
		System.out.println( "You typed what was requested: " + yep );
		System.out.println( "You ignored polite instructions: " + nope );
		
		}
	}