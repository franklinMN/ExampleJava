class Animal {
	Animal() {
		System.out.println( "This is class A..." );
	}
}

class Dog extends Animal{
	Dog() {
		System.out.println( "This is class B..." );
	}
}

class Babydog extends Dog {

	MainEX() {
		System.out.println( "This is a main method...." );
	}

	public static void main ( String [] args ) {
		
		MainEX m = new MainEX();
		
	}
}