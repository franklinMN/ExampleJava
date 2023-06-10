class Stack {
	int array[];
	int index = -1;

	Stack() {
		array = new int[5];
	}

	void push( int n ) {
		if ( index >= array.length ) {
			System.out.println( "Array out of Memory" );
			System.out.println( "Actual memory : " + array.length );
		}else {
			array[++index] = n;
		}
	}

	void pop() {
		if ( index < 0 ) {
			System.out.println( "No elements to pop..." );
		}else {
			array[index--] = 0;
		}
	}

	void printOutput() {
		System.out.print( "[ " );
		for ( int i=0 ; i<array.length ; i++ )
			System.out.print( array[i] + ", " );
		System.out.println( " ]" );
	}
} 

class StackImplementation {
	public static void main ( String [] args ) {
		Stack s = new Stack();
		s.push(10);
		s.printOutput();
		s.pop();
		s.printOutput();
		s.push(10);
		s.printOutput();
		s.push(10);
		s.printOutput();
		s.push(10);
		s.printOutput();
		s.push(10);
		s.printOutput();
		s.push(10);
		s.printOutput();
		s.pop();
		s.printOutput();
		s.pop();
		s.printOutput();
		s.pop();
		s.printOutput();
		s.pop();
		s.printOutput();
		s.pop();
		s.printOutput();
		s.pop();
		s.printOutput();
	}
}