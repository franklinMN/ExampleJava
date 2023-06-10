import java.util.*;

class PasswordGenerator {
	public static void main ( String[] args ) {
		System.out.print( "Please enter the number of characters needed for your password: " );
		Scanner input = new Scanner( System.in );
		int length = input.nextInt();
		String randomPassword = "";
		for ( int i = 0; i < length; i++)
			randomPassword += (char)getRandomNumber();

		System.out.println( "Your Password is " + randomPassword);
	}

	public static int getRandomNumber() {
		int number = (int)(Math.random() * 62);
		
		if ( number < 10 )
			number += 48;
		else if ( number < 36 )
			number += 55;
		else
			number += 61;

		return number; 
	}
}