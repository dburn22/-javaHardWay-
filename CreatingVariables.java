public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, gender;
		double seconds, e, checking, weight;
		String firstName, lastName, title, nickname;
		
		x=10;
		y=400;
		age=39;
		gender=1;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		weight = 550.45;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		nickname= "Gilligan";
		
		System.out.println( "The variable contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number; " + e );
		System.out.println( "Hopefully you have more than $" + checking + " in your checking account!" );
		System.out.println( "My name's\n" + title + " " + firstName +  lastName );
		System.out.println( "My gender is?(select 1 for male and 2 for female)" + gender );
		System.out.println( "What is your mothers weight? " + weight );
		System.out.println( "What is your nickname? " + nickname );
		
		}
	}