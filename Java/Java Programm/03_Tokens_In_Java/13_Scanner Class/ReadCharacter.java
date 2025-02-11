//WAP to read a character from the user using Scanner class :

public class ReadCharacter {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter your Gender [M/F] :");

		char gender = sc.next().charAt(0);
		System.out.println("Your Gender is :" + gender);
		sc.close();

	}

}
