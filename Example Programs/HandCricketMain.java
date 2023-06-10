import java.util.*;
import java.util.Random;

//-------------------------------------------------------------------------------------------------------
class HandCricketMain {

    static void clearScreenConsole() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    static String numToName( int n ){
        if ( n == 1 )
            return "ODD";
        else
            return "EVEN";
    }
    public static void main( String [] args ) {
        String whoBatting;
        String whoBowling;
        int oddEvenPlayerCh;
        System.out.println( "LETS PLAY HAND-CRICKET" );
        System.out.println( "Please enter your name: " );
        Scanner s = new Scanner( System.in );
        String playerName = s.next();
        ComputerRandomOutput compRan = new ComputerRandomOutput();
        while (true) {
            System.out.println( "Hard or Even - \nPress 1 for ODD or 2 for even..." );
            oddEvenPlayerCh = s.nextInt();
            if ( oddEvenPlayerCh == 1 || oddEvenPlayerCh == 2 ) {
                break;
            }else {
                System.out.println( "Invalid Input... Try again..." );
            }
        }
        System.out.println("Thanks for choosing ODD or Even");
        System.out.println( "You have choosen : " + numToName(oddEvenPlayerCh) );
        System.out.println( "Computer have choosen : " + numToName( ( (oddEvenPlayerCh)%2 == 0 ? 1 : 2) ) );
        
        int tossPlayer;
        int tossComputer;
        while (true) {
            System.out.println("Now Play a number 1 to 6 to toss...");
            tossPlayer = s.nextInt();
            if ( tossPlayer>=1 && tossPlayer<=6 ) {
                break;
            }else {
                System.out.println("Invalid Input... Try again...");
            }
        }
        tossComputer = compRan.computerChoice( 6, 1 );
        //boolean whoWonTheToss = true; // false for player, true for computer...
        // checking total of computer and player toss is odd or even and equating it with player choice odd or even
        int battingOrBowling = 0;
        if ( (tossComputer+tossPlayer)%2 == oddEvenPlayerCh%2 ) { 
                System.out.println( "You won the toss..." );
                while(true) {
                    System.out.println( "For Batting press 1\nFor Bowling press 2" );
                    battingOrBowling = s.nextInt();
                    if ( battingOrBowling==1 || battingOrBowling==2 ) {
                        break;
                    }else{
                        System.out.println( "Invalid Input... Try again..." );
                    }
                }

                if ( battingOrBowling == 1 ) {
                    System.out.println( "You Choose Batting..." );
                    whoBatting = playerName;
                    whoBowling = "Computer";
                }else {
                    System.out.println( "You Choose Bowling..." );
                    whoBatting = "Computer";
                    whoBowling = playerName;
                }

        } else {
            // whoWonTheToss = false;
            System.out.println( "Computer won the toss..." );
            battingOrBowling = compRan.computerChoice(2, 1);

            if ( battingOrBowling == 1 ) {
                System.out.println( "Computer Choose Batting..." );
                whoBatting = "Computer";
                whoBowling = playerName;
            }else {
                System.out.println( "Computer Choose Bowling..." );
                whoBatting = playerName;
                whoBowling = "Computer";
            }
        }
        System.out.println( "Press enter to start the game..." );
        s.nextLine();

        HandCricketGamePlay gameFirstHalf = new HandCricketGamePlay( playerName, whoBatting, whoBowling, 0 );
        int innings = 1;
        System.out.println( " - - - - FIRST INNINGS - - - -" );
        int preScore = gameFirstHalf.executeGame( innings );
        System.out.println( " - - - - SECOND INNINGS - - - -" );
        innings = 2;
        HandCricketGamePlay gameSecondHalf = new HandCricketGamePlay( playerName, whoBowling, whoBatting, preScore );
        int currentScore = gameSecondHalf.executeGame( innings );

        s.close();
    }
    
}
//-------------------------------------------------------------------------------------------------------
class ComputerRandomOutput {
	int randomOutput;

	int computerChoice ( int maxLimit, int minLimit) {
		Random random = new Random();
		randomOutput = random.nextInt(maxLimit*10) + minLimit;
        //System.out.print( randomOutput );
		for ( ; randomOutput > maxLimit ; randomOutput -= maxLimit ) {}
        System.out.println( "Computer Played - " + randomOutput );
		return randomOutput;
	}

}
//-------------------------------------------------------------------------------------------------------
class HandCricketGamePlay extends ComputerRandomOutput {
    static int GameScore;
    static int previousScore;
    static int bowl;
    static int addingScore;
    static String playerName;
    static String whoIsBattingNow;
    static String whoIsBowlingNow;
    static String batting = "Bat";
    static String bowling = "Bowl";
    Scanner scan = new Scanner(System.in);
    //HandCricketGamePlay hcgp = new HandCricketGamePlay();

    int checkWhetherOut( int cc, int pc) {
        //int out = 1;
            if ( cc == pc ) 
                return 1;
            else
                return 0;
    }
    
    int checkScoreThanPrevious() {
        if( previousScore < GameScore ) {
            return 1;
        }
        return 0;
    }

    void addThescore() {
        GameScore += addingScore;
        addingScore = 0;
    }

    int playTheBall( String s ) {
        int as;
        System.out.println( "Press 1 to 6 to " + s + "..." );
        as = scan.nextInt();
        return as;
        //System.out.println( "You played - " + addingScore );
    }
    
    void displayScore() {
        System.out.println( "-----------------------------------------" );
        System.out.println( "\tSCORE : " + GameScore );
        System.out.println( "-----------------------------------------" );
    }

    void outDisplay() {
        System.out.println( "- - - O U T - - -" );
        ///////////////////////////////
        displayScore();
    }

    int executeGame( int in ) {
        
        System.out.println("Batting : " + whoIsBattingNow);
        System.out.println("Bowling : " + whoIsBowlingNow);
        ////////////////////////////
        displayScore();
        
        if ( whoIsBattingNow == playerName ) {
            while (true) {
                addingScore = playTheBall(batting); ////////
                bowl = computerChoice(6, 1);//////////
                System.out.println( "Player - " + addingScore );
                System.out.println( "Computer - " + bowl );
                if ( ( checkWhetherOut( bowl, addingScore) ) == 1 ) {
                    outDisplay();//////////
                    break;
                }else {
                    addThescore();////////
                    displayScore();/////////
                    if ( in == 2 ) {
                        int i = checkScoreThanPrevious();////////
                        if ( i == 1 ) {
                            System.out.println( "Match Over..." );
                            break;
                        }
                    }
                }
                
            }
        }else if ( whoIsBattingNow == "Computer" ){
            while (true) {
                bowl = playTheBall(bowling);////////
                addingScore = computerChoice(6, 1);////////
                System.out.println( "Computer - " + addingScore );
                System.out.println( "Player - " + bowl );
                if ( ( checkWhetherOut(addingScore, bowl) == 1 ) ) {
                    outDisplay();//////////
                    break;
                }else {
                    addThescore();////////
                    displayScore();////////
                    if ( in == 2 ) {
                        int i = checkScoreThanPrevious();////////
                        if ( i == 1 ) {
                            System.out.println( "Match Over..." );
                            break;
                        }
                    }
                }
            }
        }
        return GameScore;
    }

    //HandCricketGamePlay() {}

    HandCricketGamePlay( String p, String wbt, String wbo, int ps) {
        playerName = p;
        whoIsBattingNow = wbt;
        whoIsBowlingNow = wbo;
        previousScore = ps;
        GameScore = 0;
        bowl = 0;
        addingScore = 0;

    }

}
//-------------------------------------------------------------------------------------------------------


