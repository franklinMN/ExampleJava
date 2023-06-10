class Numbers{
	public static void main(String[] args) {
    
		for( int i=1; i<=10; i++ ) {
			int sum = i;
			for( int j=1; j<=10; j++ ) {
				System.out.print( sum + "\t" );
				sum += 10;
			}
			System.out.print( "\n" );
		}
	}
}
