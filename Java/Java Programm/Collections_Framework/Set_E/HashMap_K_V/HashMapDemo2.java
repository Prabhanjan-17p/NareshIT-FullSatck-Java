package Collections_Framework.Set_E.HashMap_K_V;

import java.util.HashMap;

public class HashMapDemo2
{
    public static void main(String[] args) 
    {
       HashMap<Integer, String> studentRecords = new HashMap<>();

        studentRecords.put(101, "Scott");
        studentRecords.put(102, "Smith");
        studentRecords.put(103, "Martin");
        studentRecords.put(104, "Aryan");

        System.out.println("Student Records: " + studentRecords);

     
        
        int searchId = 103;
        String studentName = studentRecords.get(searchId);
        
        if (studentName != null)
        {
            System.out.println("Student with ID " + searchId + " is " + studentName);
        } 
        else
        {
            System.out.println("Student with ID " + searchId + " not found.");
        }
             
      
        System.out.println(studentRecords.put(103, "Rahul"));
        System.out.println("Updated Records: " + studentRecords);
        
        
        
        studentRecords.remove(104);
        System.out.println("Records after removal: " + studentRecords);

        
        int idToCheck = 101;
        System.out.println("Does ID " + idToCheck + " exist? " + studentRecords.containsKey(idToCheck));

            
        String nameToCheck = "Aryan";
        System.out.println("Does name '" + nameToCheck + "' exist? " + studentRecords.containsValue(nameToCheck));

       
       
        System.out.println("Iterating through records:");
        for(HashMap.Entry<Integer, String> entry : studentRecords.entrySet()) 
        {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        studentRecords.clear();
        System.out.println("All records cleared: " + studentRecords); //{} 
     
     
    }
}