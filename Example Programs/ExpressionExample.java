class ExpressionExample {
	public static void main ( String [] args ) {
		int x=0;
		int y=0;
		int exp=0;
		boolean flag = false;
		for ( x = -100 ; x<=100 ; x++ ) {
			for ( y = -100; y<=100 ; y++ ) {
				exp = x + x*y + y;
				if ( exp == 76 ) {
					System.out.println( "----------------------------" );
					System.out.println( "X : " + x + "\nY : " + y );
					flag = true;
				}
			}

		}
		if ( !flag )
			System.out.println( "No combinations..." );
	}
}