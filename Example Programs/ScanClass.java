import java.util.Scanner;

class ScanClass {
	public static void main ( String [] args ) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print( "\nEnter your Name : " );
		String name = scan.nextLine();

		System.out.print( "\nEnter your Age : " );
		int age = scan.nextInt();

		System.out.print( "\nEnter your Mark Percentage : " );
		float percent = scan.nextFloat();

		System.out.print( "\nAre you Working - Choose true or false : " );
		boolean working = scan.nextBoolean();

		System.out.print( "\n----------------------------" );
		System.out.print( "\nName : " + name );
		System.out.print( "\nAge : " + age );
		System.out.print( "\nPercentage : " + percent );
		System.out.print( "\nWorking status : " + working );
		System.out.print( "\n----------------------------" );	
	}
}