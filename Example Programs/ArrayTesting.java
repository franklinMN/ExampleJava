import java.util.Scanner;

class ArrayTesting {

	int[] getArrayElements() {
		Scanner s = new Scanner(System.in);
		int[] temp = new int[5];
		System.out.println( "Enter the array elements: " );
		for ( int i = 0 ; i < 5 ; i++) {
			temp[i] = s.nextInt();
		}
		return temp;
	}

	int[] getFactorialOfNumbers( int[] arr ) {
		int fact;
		int[] temp = new int[5];
		for( int i = 0 ; i < arr.length ; i++ ) {
			fact = 1;
			for( int j = arr[i] ; j > 1 ; j-- ) {
				fact *= j;
			}
			temp[i] = fact;
		}
		return temp;
		
	}	

	void displayArray( String arrayName, int[] arr ) {
		System.out.println( "Elements in the array '" + arrayName + "' are listed below..." );
		for( int i = 0 ; i < arr.length ; i++ ) {
			System.out.println( "The value of " +arrayName+ "[" +i+ "]" + " is : " + arr[i] );
		}
	}

	public static void main ( String [] args ) {
		ArrayTesting object = new ArrayTesting();

		int[] array1 = new int[5];
		array1 = object.getArrayElements();
		object.displayArray( "array1", array1 );

		int[] array2 = new int[5];
		array2 = object.getFactorialOfNumbers( array1 );
		object.displayArray( "array2", array2 );
		
	}
}