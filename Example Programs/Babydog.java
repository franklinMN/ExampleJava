class Animal {
	Animal() {
		System.out.println( "This is class Aniaml..." );
	}
	void eat() { System.out.println( "Aniaml will eat..." ); }
}

class Dog extends Animal{
	Dog() {
		System.out.println( "This is class Dog..." );
	}
	void eat() { System.out.println( "Dog will also eat..." ); }
}

class Babydog extends Dog {

	Babydog() {
		System.out.println( "This is a Babydog...." );
	}
	void eat() { System.out.println( "Babydog will also eat..." ); }

	public static void main ( String [] args ) {
		
		Babydog bd = new Babydog();
		bd.eat();
		
	}
}