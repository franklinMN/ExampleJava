import java.util.Random;
import java.util.Scanner;

class ComputerRandomizer {
	static int maxLimit = 30;
	int randomOutput;

	int computerChoice () {
		Random random = new Random();
		randomOutput = random.nextInt(maxLimit) + 1;
		for ( ; randomOutput > 3 ; randomOutput -= 3 ) {}
		return randomOutput;
	}
}

class StonePaperScissors{

	static String numberToString( int r ) {
		if ( r == 1 )
			return "Stone";
		else if ( r == 2 )
			return "Paper";
		else
			return "Scissor";
	}

	void choiceDisplay( int r, int u, String n ) {
		System.out.println( "----------------------------------------" );
		System.out.println( "\t\t" + n );
		System.out.println( "----------------------------------------" );
		System.out.println( "Your choice is " + numberToString(u) );
		System.out.println( "Computer choice is " + numberToString(r) );
		System.out.println( "----------------------------------------" );
	}

	public static void main ( String [] args ) {
		
		int random;
		int userChoice;

		System.out.println( "----------------------------------------" );
		System.out.println( "\tSTONE-PAPER-SCISSOR" );
		System.out.println( "----------------------------------------" );
		System.out.println( "\tSelect your choice from below..." );
		System.out.println( "\tPress 1 for stone.\n\tPress 2 for paper.\n\tPress 3 for Scissor." );
		System.out.println( "----------------------------------------" );
		Scanner s = new Scanner( System.in );
		while(true) {
			userChoice = s.nextInt();
			if( userChoice != 1 && userChoice != 2 && userChoice != 3 ) {
				System.out.println( "Invalid input please, please enter the correct value..." );
				System.out.println( "Press 1 for Stone.\nPress 2 for Paper.\nPress 3 for Scissor." );
			} else {
				break;
			}
		}

		ComputerRandomizer cr = new ComputerRandomizer();
		StonePaperScissors sps = new StonePaperScissors();

		random = cr.computerChoice();
		if ( random == userChoice )
			sps.choiceDisplay( random, userChoice, "DRAW..." );
		else if ( random == 1 && userChoice == 2 )
			sps.choiceDisplay( random, userChoice, "You WON..." );
		else if ( random == 1 && userChoice == 3 )
			sps.choiceDisplay( random, userChoice, "You LOSE..." );
		else if ( random == 2 && userChoice == 1 )
			sps.choiceDisplay( random, userChoice, "You LOSE..." );
		else if ( random == 2 && userChoice == 3 )
			sps.choiceDisplay( random, userChoice, "You WON..." );
		else if ( random == 3 && userChoice == 1 )
			sps.choiceDisplay( random, userChoice, "You WON..." );
		else if ( random == 3 && userChoice == 2 )
			sps.choiceDisplay( random, userChoice, "You LOSE..." );
	}
}