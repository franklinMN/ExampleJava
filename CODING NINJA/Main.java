import java.util.* ;
import java.io.*; 
public class Main {
    public int maxSumRectangle(int[][] arr, int n, int m) {
        int row = n;
        int column = m;
        int maxSum = 0;
        int sum = 0;
        int i, j, k, l;
	int flag = 0;

        for ( i=0 ; i<row ; i++ ) {
            for ( j=0 ; j<column ; j++ ) {
                for ( k=i ; k<row; k++ ) {
                    for ( l=j ; l<column ; l++ ) {
                        sum = calcSum( arr, k, l, i, j );
			if (flag==0) {
                            maxSum = sum;
                            flag++;
			    continue;
                        }
                        maxSum = ( maxSum > sum ) ? maxSum : sum;
                    }
                }
            }
        }

        return maxSum;
    }

    int calcSum( int[][] arr, int row, int col, int l1, int l2 ) {
	// System.out.println( "CAME HERE" );
	// System.out.println( "row : " + row );
	// System.out.println( "col : " + col );
	// System.out.println( "l1 : " + l1 );
	// System.out.println( "l2 : " + l2 + "\n\n" );
        int sum = 0;
        for ( int i=l1 ; i<=row ; i++) {
            for ( int j=l2 ; j<=col ; j++ ) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    
    public static void main ( String[] args ) {

	Main m = new Main();
        
        int [][] arr = {
            { 28, 26, 11, 16, 1 },
            { 21, 3, -13, -26, -20 },
	    { 6, 22, 9, -29, -28 },
	    { -21, -30, -21, 7, -30 },
	    { -11, 21, 11, 24, 22 }
        };
        int sum = m.maxSumRectangle( arr , 5 , 5);
        
        System.out.println( "Sum : " + sum );
    }
}
