package FlamesProgram;

import java.util.Scanner;

public class Flames {
    public String FLAMES;
    public String nameOne;
    public String nameTwo;
    public int nameOneLenght, nameTwoLenght;
    public int flamesCounter;

    Flames() {
        this.FLAMES = "FLAMES";
        this.nameOneLenght = 0;
        this.nameTwoLenght = 0;
        this.flamesCounter = 0;
    }

    public void getNames() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first person's name: ");
        nameOne = sc.nextLine();
        System.out.println("Enter Second person's name: ");
        nameTwo = sc.nextLine();
        //changeing the characters of the names into lowercase....
        this.nameOne = nameOne.toLowerCase();
        this.nameTwo = nameTwo.toLowerCase();
        //Removing the whitespaces from the given names.....
        this.nameOne = nameOne.replaceAll("\\s", "");
        this.nameTwo = nameTwo.replaceAll("\\s", "");
        //finding the length of the names.....
        this.nameOneLenght = this.nameOne.length();
        this.nameTwoLenght = this.nameTwo.length();
        //for testing purpose.....
        System.out.println(this.nameOne + "\t" + this.nameOneLenght);
        System.out.println(this.nameTwo + "\t" + this.nameTwoLenght);
        sc.close();
    }

    private void cancelSameLetters() {
        StringBuilder sb1 = new StringBuilder(this.nameOne);
        StringBuilder sb2 = new StringBuilder(this.nameTwo);

        for( int i=0 ; i < nameOneLenght ; i++) {
            //System.out.println(this.nameOne.charAt(i));
            for( int j=0 ; j < nameTwoLenght ; j++ ) {
                if ( this.nameOne.charAt(i) == this.nameTwo.charAt(j) ) {
                    sb1.setCharAt( i, '0' );
                    this.nameOne = sb1.toString();
                    sb2.setCharAt( j, '0' );
                    this.nameTwo = sb2.toString();
                    break;
                }
            }
        }
        //for testing purpose.....
        System.out.println(this.nameOne + "\t" + this.nameOneLenght);
        System.out.println(this.nameTwo + "\t" + this.nameTwoLenght);
    }

    private void counterLenght() {
        for ( int i=0 ; i < nameOneLenght ; i++ ) {
            if( this.nameOne.charAt(i) != '0' )
                this.flamesCounter++;
        }
        //for testing purpose.....
        System.out.println("Total count is : " + flamesCounter );
        for ( int i=0 ; i < nameTwoLenght ; i++ ) {
            if( this.nameTwo.charAt(i) != '0' )
            this.flamesCounter++;
        }
        //for testing purpose.....
        System.out.println("Total count is : " + flamesCounter );
    }

    private void cancelFlames() {
        int CURRENT_LENGTH = 5;
        while ( CURRENT_LENGTH != 0 ) {
            int length = 0;
            int j;
            for ( j=0 ; length<this.flamesCounter-1 ; j++, length++) {
                if ( j == CURRENT_LENGTH )
                    j = -1;
            }
            CURRENT_LENGTH = reArrangeString( j, CURRENT_LENGTH );
        }
    }

    private int reArrangeString( int position, int CL ) {
        String temp = this.FLAMES;
        int i;
        StringBuilder sb = new StringBuilder(this.FLAMES);
        //StringBuilder sb2 = new StringBuilder(this.temp);
        for ( i=0 ; i<CL ; i++ ) {
            if ( position == CL ) {
                position = -1;
            }
            sb.setCharAt(i, temp.charAt(position+1));
            position++;
        }
        sb.setCharAt(i, '\0');
        FLAMES = sb.toString();
        System.out.println(this.FLAMES);
        return CL-1;
    }

    public void printResult() {
        System.out.println("-----------------");
        switch( this.FLAMES.charAt(0) ) {
            case 'F': System.out.println("FRIENDS"); break;
            case 'L': System.out.println("LOVE"); break;
            case 'A': System.out.println("AFFECTION"); break;
            case 'M': System.out.println("MARRIAGE"); break;
            case 'E': System.out.println("ENEMY"); break;
            case 'S': System.out.println("SISTERS, BROTHERS"); break;
        }
        System.out.println("-----------------");
    }

    public void calculateFlames(){
        this.cancelSameLetters();
        this.counterLenght();
        this.cancelFlames();
        this.printResult();
    }

}
