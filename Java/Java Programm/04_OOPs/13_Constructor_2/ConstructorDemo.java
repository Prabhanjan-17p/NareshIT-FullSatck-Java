class Student {
	/*
	public void Student() // it is a method because it is used void (means a return type)
	{
		System.out.println("It is a method");
	}
	*/

	public Student() { // it is a Constructor
		System.out.println("I am in Constructor");
	}

}

public class ConstructorDemo {

	public static void main(String[] args) {
		// System.out.println("Main");

		Student s1 = new Student();
		// s1.Student(); // Calling the Method
		System.out.println(s1);
	}

}