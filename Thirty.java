import java.util.Scanner;

public class Thirty {
	public static void main( String[] argas ) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print( "Which month? (1-12) " );
		int month = kb.nextInt();
		
		System.out.println(monthDays(month) + " days hath " + monthName(month));
		
	}
	
	public static String monthName( int month ) {
		String monthName = "error";
		
		if ( month == 1 )
			monthName = "JAN";
			
			else if ( month == 2 ) 
				monthName = "FEB";
				else if ( month == 3 ) 
				monthName = "MAR";
				else if ( month == 4 ) 
				monthName = "APRIL";
				else if ( month == 5 ) 
				monthName = "MAY";
				else if ( month == 6 ) 
				monthName = "JUNE";
				else if ( month == 7 ) 
				monthName = "JULY";
				else if ( month == 8 ) 
				monthName = "AUG";
				else if ( month == 9 ) 
				monthName = "SEP";
				else if ( month == 10 ) 
				monthName = "OCT";
				else if ( month == 11 ) 
				monthName = "NOV";
				else if ( month == 12 ) 
				monthName = "DEC";
				
				return monthName;
				
			}
			
			public static int monthDays( int month ) {
				int days;
				
				switch(month)
				
			{
			
				case 9:
				case 4:
				case 6:
				case 11: days = 30;
					break;
				case 2: days = 28;
					break;
				default: days = 31;
				
			}
			return days;
			
		}
	}
				 
			
				
				
				
				
				
				
				
				