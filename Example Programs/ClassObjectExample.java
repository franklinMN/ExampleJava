

class Student {
	int rollNumber;
	String name;
	static String college;
}

class ClassObjectExample{
	public static void main ( String [] args ) {
		Student s1 = new Student();
		s1.rollNumber = 123;
		s1.name = "Franklin";
		s1.college = "CCET";
		System.out.println( s1.rollNumber + "  " + s1.name + "  " + s1.college );

		Student s2 = new Student();
		s2.rollNumber = 124;
		s2.name = "Deva";
		s2.college = "TAC";
		System.out.println( s2.rollNumber + "  " + s2.name + "  " + s2.college );
		System.out.println( s1.rollNumber + "  " + s1.name + "  " + s1.college );
		
	}
}