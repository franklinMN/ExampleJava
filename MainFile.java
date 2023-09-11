class Calculate {
    public boolean isPrime( int number) {
        //0 and 1 are not a prime numbers
        if( number<2 )
            return false;
        //2 is a prime number
        if( number == 2 )
            return true;
        //even numbers are not a prime number except 2
        if( number%2 == 0 )
            return false;
        //if odd number but it gets divided by any other number except by itself or 1, then it is not a prime number
        for( int i=3 ; i<number ; i+=2 ) { //i+=2 this will generate odd numbers, we no need of even numbers since it is checked in before condition.
            if( number%i == 0 )
                return false;
        }
        //if no other condition before this is getting satisfied then it will be a prime number, so return true...
        return true;
    }
    public void primeOfRange( int start, int end ) {
        for( int i=start ; i<=end ; i++ ) {
            if( isPrime( i ) )
                System.out.print( i + "  " );
        }
        System.out.println( );
    }
    
}

public class MainFile {
    public static void main( String[] args ) {
        int number = 10;
        Calculate c = new Calculate();
        // if( c.isPrime( number ) )
        //     System.out.println( number + " is a Prime Number." );
        // else
        //     System.out.println( number + " is a NOT Prime Number." );
        
        c.primeOfRange( 1, 50 );
    }
}