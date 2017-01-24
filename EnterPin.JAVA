import java.util.Scanner;

public class EnterPin {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String password;
		
		password = ("hunter2");
		
		pin = 12345;
		
		System.out.println("WELCOME TO THE BANK OF JAVA");
		System.out.println("ENTER YOUR PASSWORD: ");
		entry = keyboard.nextInt();
		System.out.println("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
		
		while ( ! password.equals ("hunter2" ) ) {
		//issues compiling to add a password (in class question.
		System.out.println("\nincorrect Password. TRY AGAIN.");
		System.out.print("ENTER YOUR PASSWORD: ");
		entry = keyboard.nextInt();
		}
		
		while ( entry != pin ) {
		System.out.println("\nincorrect pin. TRY AGAIN.");
		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
		
	}
	
	System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $12,342,400,000");
	}
}