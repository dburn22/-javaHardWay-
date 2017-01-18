import java.util.Scanner;

	public class BMICat {
		public static void main( String[] args ) {
			Scanner keyboard = new Scanner(System.in);
			double inches, lbs, feet, bmi;
		
		System.out.print( "Your height in feet: " );
		feet = keyboard.nextDouble();
		feet = (feet*12*0.025);
		
		System.out.print( "Your height in inches: " );
		inches = keyboard.nextDouble();
		inches = (inches*0.025);
		
		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();
		lbs = (lbs*0.45);
		
		
		
		bmi = lbs / (feet+inches*inches + feet);
		
		System.out.println( "Your BMI is " + bmi );
			
			
			
			System.out.print( "BMI category: " );
			if ( bmi < 15.0 ) {
				System.out.println( "very severely underweight" );
				
			}
			else if ( bmi <= 16.0 ) {
				System.out.println( "severely underweight" );
			}
			else if (bmi < 18.5 ) {
				System.out.println( "underweight" );
			}
			else if ( bmi < 25.0 ) {
				System.out.println( "normal weight" );
			}
			else if ( bmi < 30.0 ) {
				System.out.println ( "overweight" );
			}
			else if ( bmi < 35.0 ) {
				System.out.println ( "moderatley obese" );
			}
			else if ( bmi < 40.0 ) {
				System.out.println ( "really obese" );
			}
		}
	}
			
			
		
		