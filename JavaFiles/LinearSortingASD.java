import java.util.Scanner;

class LinearSortingASD {

	static int num;
	int array[];

	LinearSortingASD( int n ) {
		num = n;
		array = new int[num];
	}

	void getElements( Scanner s ) {
		System.out.println( "Please enter the " + num + "values to sort, one by one by pressing the enter each time..." );
		for ( int i = 0 ; i<num ; i++ ) {
			array[i] = s.nextInt();
		}
	}

	void printElements() {
		for ( int i = 0 ; i<num ; i++ ) {
			System.out.print( array[i] + "   " );
		}
	}

	void taskAscendingOrder() {
		for ( int i = 0 ; i<num ; i++ ) {
			for ( int j = i+1 ; j<num ; j++ ) {
				if ( array[i] > array[j] ) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static void main( String [] args ) {

		Scanner s = new Scanner( System.in );
		System.out.println( "Enter the number of elements you want to sort..." );
		int n = s.nextInt();
		
		LinearSortingASD obj1 = new LinearSortingASD( n );

		obj1.getElements( s );
		System.out.println( "\nBefore Sorting in Ascending order...." );
		obj1.printElements();
		obj1.taskAscendingOrder();
		System.out.println( "\nAfter Sorting in Ascending order...." );
		obj1.printElements();
	}
}