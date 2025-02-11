//How to read name from the user using Scanner class :

import java.util.*;

public class ReadName 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your Name :");
		
		String name =  sc.nextLine();
		System.out.println("Your Name is :"+name);
	}
}