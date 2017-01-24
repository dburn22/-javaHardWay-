import java.util.Scanner;

public class Safe {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		boolean yes, no;
		
		
		
		System.out.println("Are you ready? ");
		yes = ( yes GREATER THAN no) );
		no = (no LESS THAN yes) );
		System.out.println( "Let's get started" + yes );
		
		a = keyboard.nextBoolean();
		System.out.print("Give me a number, and I will find it's square root. " );
		System.out.print("(No negatives, pelase.) ");
		
		x = keyboard.nextDouble();
		
		while ( x < 0 ) {
			System.out.println("I won't take the square root of a negative number. ");
			System.out.print("\nNew number: ");
			x = keyboard.nextDouble();
		
		}
		
		y = Math.sqrt(x);
		
		System.out.println("The square root of "+x+" is" +y);
	}
}