class TeachingSwapValueAB {
	public static void main ( String [] args ) {
		
		int a = 35;
		int b = 20;
 
		System.out.println( "In this example, we will see about how to swap two values of two variables without using a third variable." );
		System.out.println( "Let us consider a = " + a + " and b = " + b );
		System.out.println( "So, Before performing swapping operation a = " + a + " and b = " + b );

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println( "Before swapping a = " + a + " and b = " + b );
	}
}