// WAP to read student data from the Scanner class :

import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("Enter Student Id :");		
		int id = sc.nextInt();	
		
		System.out.print("Enter Student Name :");
		String name = sc.nextLine(); //Buffer Problem
		name = sc.nextLine();
		
		System.out.println("Student Id is :"+id);
		System.out.println("Student name is :"+name);
		
		sc.close();

	}

}