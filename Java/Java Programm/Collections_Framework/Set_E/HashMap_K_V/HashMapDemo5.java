package Collections_Framework.Set_E.HashMap_K_V;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class HashMapDemo5
{
    public static void main(String[] args) 
    {
        // Create a HashMap to store book titles and their availability (true = available, false = borrowed)
    	
        HashMap<String, Boolean> library = new HashMap<>();

        library.put("Core Java", true);
        library.put("Advanced Java", true);
        library.put("HTML", false);
        library.put("JavaScript", true);

        // Display the initial library status
        System.out.println("Initial Library Status: " + library);
        
       
        
        // Borrow a book
        String bookToBorrow = "Advanced Java";
        
        if (library.containsKey(bookToBorrow) && library.get(bookToBorrow)) 
        {
            library.put(bookToBorrow, false); 
            System.out.println(bookToBorrow + " has been borrowed.");
        } 
        else
        {
            System.out.println(bookToBorrow + " is not available for borrowing.");
        }
        
     
        
        String bookToReturn = "HTML";
        
        if (library.containsKey(bookToReturn) && !library.get(bookToReturn))
        {
            library.put(bookToReturn, true); // Mark the book as available
            System.out.println(bookToReturn + "Book has been returned.");
        } 
        else 
        {
            System.out.println(bookToReturn + "Book is not borrowed.");
        }   
       
     
         
        // Check the availability of a book
        String bookToCheck = "JavaScript";
        
        if (library.containsKey(bookToCheck))
        {
          String availability = library.get(bookToCheck) ? "available" : "borrowed";
            System.out.println(bookToCheck + " Book is " + availability + ".");
        } 
        else
        {
            System.out.println(bookToCheck + " is not in the library.");
        }
    
        
        //Display the final library status
        
        System.out.println("Final Library Status:");
        for (HashMap.Entry<String, Boolean> entry : library.entrySet()) 
        {
            String status = entry.getValue() ? "Available" : "Borrowed";
            System.out.println("Book: " + entry.getKey() + ", Status: " + status);
        }
       
      //"
    }
}