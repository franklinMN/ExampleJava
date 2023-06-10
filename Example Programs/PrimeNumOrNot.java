class PrimeNumOrNot{
	public static void main(String[] args) {
    
		int lowRange = 0, highRange = 30;

		while ( lowRange <= highRange ) {
			boolean flag = false;

			for ( int i=2 ; i<lowRange ; i++ ) {
				if ( lowRange % i == 0 ) {
					flag = true;
					break;
				}
			}
			if ( !flag && lowRange != 0 && lowRange != 1 ) {
				System.out.print( lowRange + "  " );
			}
			lowRange++;
		}
	}
}
