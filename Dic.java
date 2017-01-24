import java.util.Scanner;

public class Dic {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String name;
		
		System.out.print( "Make up the name of a programming language! " );
		name = keyboard.nextLine();
		
		if ( name.compareTo( "c++") < 0 )
			System.out.println( name + " comes BEFORE c++ " );
		if ( name.compareTo( "c++") == 0 )
			System.out.println( "c++ isn't a made-up language!" );
		if ( name.compareTo("c++") > 0 )
			System.out.println( name + " comes AFTER c++" );
		if ( name.compareTo("Java") < 0 )
			System.out.println( name + " comes BEFORE java" );
		if ( name.compareTo("Java") == 0 ) 
			System.out.println( "Java isn't a made up language! " );
		if ( name.compareTo( "Java" ) > 0 ) 
			System.out.println( name + " Comes AFTER java " );
			
		if ( name.compareToIgnoreCase("lisp") < 0 )
			System.out.println( name + " comes BEFORE lisp" );
		if ( name.compareTo("lisp") == 0 )
			System.out.println( "lisp isn't a made-up language!" );
		if ( name.compareTo("lisp") > 0 )
			System.out.println( name+ " comes AFTER lisp" );
			
		if ( name.compareTo("python") < 0 )
			System.out.println( name + " comes BEFORE python" );
		if ( name.compareTo("python") == 0 ) 
			System.out.println( "python isn't a made-up language!" );
		if ( name.compareTo("python") > 0 )
			System.out.println( name + "comes AFTER python " );
			
		if ( name.compareTo("ruby") < 0 )
			System.out.println( name + " comes BEFORE ruby" );
		if ( name.compareTo("ruby") == 0)
			System.out.println( " ruby is not a made up language" );
		if ( name.compareTo("ruby") > 0 )
			System.out.println( name + " comes AFTER ruby" );
			
		if ( name.compareTo("visualbasic" ) < 0 )
			System.out.println( name + " comes BEFORE visualbasic" );
		if ( name.compareTo("visualbasic") == 0 )
			System.out.println( " visualbasic is not a made up language! " );
		if ( name.compareTo("visualbasic") > 0 )
			System.out.println( name + " comes AFTER visualbasic" );
		}
	}
			
		
		
		
		
		
		
		
		