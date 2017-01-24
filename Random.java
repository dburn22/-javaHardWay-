public class Random {
	public static void main( String[] args ) {
		int a, b, c, d;
		double r, rps;
		
		rps = Math.random();
		if ( rps < 0.3333333 ) { // will be true 1/3 of the time//
			System.out.println( "ROCK " );
		}
		else if ( rps < 0.6666667 ) {
			System.out.println( " PAPER" );
		}
		else {
			System.out.println( "SCISORS" );
		}
		
		//pick 4 random numbers//
		a = 1 + (int)( 10*Math.random() );	
		b = 1 + (int)( 10*Math.random() );
		c = 1 + (int)( 10*Math.random() );	
		d = 1 + (int)( 10*Math.random() );	
		System.out.println( "1-10:\t" + a + "\t" + b + "\t" + c + "\t" + d );
		
		//pick 4 random integers 1-6//
		a = 1 + (int)( 6*Math.random() );
		b = 1 + (int)( 6*Math.random() );
		c = 1 + (int)( 6*Math.random() );
		d = 1 + (int)( 6*Math.random() );	
		System.out.println( "1-6:\t" + a + "\t" + b + "\t" + c + "\t" + d );
		
		//pick single random integer//
		a = 1 + (int)(100*Math.random() );
		System.out.println( "1-100:\t" + a + "\t" + a + "\t" + a + "\t" + a );
		
		// pick 4 random integers. each 1-100
		a = 1 + (int)(100*Math.random() );
		b = 1 + (int)(100*Math.random() );
		c = 1 + (int)(100*Math.random() );
		d = 1 + (int)(100*Math.random() );
		System.out.println( "1-100:\t" + a + "\t" + b + "\t" + c + "\t" + d );
		
		// pick 4 random integers. each 00-99//
		a = 0 + (int)(100*Math.random() );
		b = 0 + (int)(100*Math.random() );
		c = (int)(100*Math.random() );
		d = (int)(100*Math.random() );
		System.out.println( "0-99:\t" + a + "\t" + b + "\t" + c + "\t" + d );
		
		// pick 4 random integers, each 10-20
		a = 10 + (int)(11*Math.random() );
		b = 10 + (int)(11*Math.random() );
		c = 10 + (int)(11*Math.random() );
		d = 10 + (int)(11*Math.random() );
		System.out.println( "10-20:\t" + a + "\t" + b + "\t" + c + "\t" + d );
		
		// display 4 random doubles, each [0-1]
		System.out.println( "0-1: \t" + Math.random() + "\t" + Math.random() );
		System.out.println( "0-1: \t" + Math.random() + "\t" + Math.random() );
		
		r = 10 * Math.random();
		System.out.println ( "0-9.99:\t + r" );
		System.out.println( "0-9:\t" + (int)r );
		System.out.println( "1-10:\t" + (1 + (int)r) );
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
				