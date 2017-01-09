import java.util.Scanner;

public class ForgetfulMachine {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "What city is the capital of France?" );
		keyboard.next();
		
		System.out.println( "What is 6 times 7?" );
		keyboard.next();
		
		System.out.println( "Enter a number between 0.0 and 1.0." );
		keyboard.nextDouble();
		
		System.out.println( "Is there anything ele you would like to say?" );
		keyboard.next();
		//Nothing I typed into question 2 or 3 made the system blow up//
		
		}
	}
		