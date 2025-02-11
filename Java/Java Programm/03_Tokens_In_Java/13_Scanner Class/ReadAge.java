//WAP to read your age from the Scanner class :

import java.util.Scanner;

public class ReadAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age :");

		int age = sc.nextInt();
		System.out.println("Your Age is :" + age);

		sc.close();
	}

}