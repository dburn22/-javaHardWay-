import java.util.Scanner;

public class Seq {
	public static void main( String[] args ) {
	
	Scanner keyboard = new Scanner(System.in);
	double price , salestax, total;
	//taking the "0" out of the price double does not change or show an error after compiling//
	
	
	System.out.print( "How much is the purchase price? " );
	price = keyboard.nextDouble();
	
	salestax = price * 0.0825;
	total = price + salestax;
	
	System.out.println( "Item price: \t" + price ) ;
	System.out.println( "Sales Tax:\t" + salestax );
	System.out.println( "Total cost:\t" + total );
	
	}
}
	