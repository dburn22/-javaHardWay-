import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Hello. What is your names\b?" );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println("So your're" + age + ", eh? Thats not very old." );
		System.out.print("How much do you weigh, " + name + "?");
		weight = keyboard.nextDouble();
		
		System.out.print( weight + "!Better keep that quiet!!" ) ;
		System.out.print( "Finally, what is your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( " Well, thanks" + name + "for answering my rude questions!");
		
		// I added the name command in this line to practice, instead of adding another line of code//
		
		/* Does the program blow up if you enter an integer value when it is expecting you to
type a double? No I believe that is due to the fact that you wouldn't put an integer value high enough 
into a double to make the program blow up.//
/* Does the program blow up if you enter a numeric value (integer or double) when it
is expecting a String? Yes the program does blow up because a String is used to represent 
a series of letters, and not numeric values./


		
		}
	}