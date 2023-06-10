class DataTypePrinter {
	public static void main ( String [] args ) {
		byte byteTotalBits = 8;
		byte byteMinValue = -128;
		byte byteMaxValue = 127;
		byte byteDefaultValue = 0;
		byte byteExampleValue = 10;
		
		System.out.println( "\n----------------------------------------------------------------------------------\n" );
		System.out.println( "\n\tByte Data Type:\n" );
		System.out.println( "\tIt is an " + byteTotalBits + "-bit signed two's complement integer." );
		System.out.println( "\tIts minimum value is " + byteMinValue );
		System.out.println( "\tIts maximum value is " + byteMaxValue );
		System.out.println( "\tIts Default value is " + byteDefaultValue );
		System.out.println( "\n\tExample:\n" );
		System.out.println( "\tbyte a = " + byteExampleValue + ";" );
		System.out.println( "\n----------------------------------------------------------------------------------\n" );
	}
}