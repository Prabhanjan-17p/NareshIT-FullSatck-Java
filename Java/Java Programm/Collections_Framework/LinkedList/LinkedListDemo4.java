package Collections_Framework.LinkedList;//Insertion, deletion, displaying and exit

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDemo4
{
 public static void main(String[] args)
	{
      List<Integer> linkedList = new LinkedList<>();
      Scanner scanner = new Scanner(System.in);

        while (true) 
		{
          System.out.println("Linked List: " + linkedList); //[]
          System.out.println("1. Insert Element");
          System.out.println("2. Delete Element");
		  System.out.println("3. Display Element");
          System.out.println("4. Exit");
          System.out.print("Enter your choice: ");

          int choice = scanner.nextInt();
          switch (choice) 
			{
              case 1: 
                  System.out.print("Enter the element to insert: ");
                  int elementToAdd = scanner.nextInt();
                  linkedList.add(elementToAdd);
                  break;
              case 2:
                  if (linkedList.isEmpty()) 
					{
                      System.out.println("Linked list is empty. Nothing to delete.");
                  } 
					else 
					{
                      System.out.print("Enter the element to delete: ");
                      int elemenetToDelete = scanner.nextInt(); 
                      boolean remove = linkedList.remove(Integer.valueOf(elemenetToDelete));
                         
                      
                       if(remove)
                       {
                    	   System.out.println("Element "+elemenetToDelete+ " is deleted Successfully" );
                       }
                       else
                       {
                    	   System.out.println("Element "+elemenetToDelete+" not available is the LinkedList");
                       }
                    
                  }
                  break;
				case 3:
					System.out.println("Elements in the linked list.");
                    linkedList.forEach(System.out::println);
				     break;
              case 4:
                  System.out.println("Exiting the program.");
                  scanner.close();
                  System.exit(0);
              default:
                  System.out.println("Invalid choice. Please try again.");
          }
      }
  }
}