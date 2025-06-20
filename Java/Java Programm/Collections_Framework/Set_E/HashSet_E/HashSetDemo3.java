package Collections_Framework.Set_E.HashSet;//add, delete, display and exit
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo3
{
    public static void main(String[] args) 
		{
        HashSet<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) 
		{
            System.out.println("Options:");
            System.out.println("1. Add element");
            System.out.println("2. Delete element");
            System.out.println("3. Display HashSet");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) 
			{
                case 1:
                    System.out.print("Enter the element to add: ");
                    String elementToAdd = scanner.next();
                    if (hashSet.add(elementToAdd)) 
					{
                        System.out.println("Element added successfully.");
                    } 
					else
					{
                        System.out.println("Element already exists in the HashSet.");
                    }
                    break;
                    case 2:
                    System.out.print("Enter the element to delete: ");
                    String elementToDelete = scanner.next();
                    if (hashSet.remove(elementToDelete)) 
					{
                        System.out.println("Element deleted successfully.");
                    } 
					else 
					{
                        System.out.println("Element not found in the HashSet.");
                    }
                    break;
                    case 3:
                    System.out.println("Elements in the HashSet:");
                    hashSet.forEach(System.out::println);
                    break;
                    case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    default:
                    System.out.println("Invalid choice. Please try again.");
            }
//"
            System.out.println(); 
        }
    }
}