
//Three Ways to create the String Object
class StringTest1 {
	public static void main(String[] args) {
		String s1 = "Hello World"; // Literal
		System.out.println(s1);

		String s2 = new String("Ravi"); // Using new Keyword
		System.out.println(s2);

		char s3[] = { 'H', 'E', 'L', 'L', 'O' }; // Character Array
		System.out.println(s3);

	}
}

// String is collection of alpha-numeric character
class String_Literals {
	public static void main(String[] args) {
		String x = "B-61 Hyderabad";
		System.out.println(x);

		String y = "123";
		System.out.println(y);

		String z = "67.90";
		System.out.println(z);

		String p = "A";
		System.out.println(p);
	}
}

class StringTest3 {
	public static void main(String[] args) {
		String s = 15 + 29 + "Ravi" + 40 + 40;
		System.out.println(s);

	}
}