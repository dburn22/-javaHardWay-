import java.util.Scanner;

public class BMICalc  {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double inches, lbs, feet, BMI;
		
		System.out.print( "Your height in feet: " );
		feet = keyboard.nextDouble();
		feet = (feet*12*0.025);
		
		System.out.print( "Your height in inches: " );
		inches = keyboard.nextDouble();
		inches = (inches*0.025);
		
		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();
		lbs = (lbs*0.45);
		
		
		
		BMI = lbs / (feet+inches*inches + feet);
		
		System.out.println( "Your BMI is " + BMI );
		
		}
	}