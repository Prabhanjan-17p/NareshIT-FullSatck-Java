//Custom HashCode for String class

package Collections_Framework.Set_E.HashMap_K_V;

import java.util.Scanner;

public class CustomStringHashCode 
{
    public static int customHashCode(String str)
    {
        if (str == null) 
        {
            return 0; // default hashCode value for null is 0
        }

        int hashCode = 0;  

        for (int i = 0; i < str.length(); i++)  //NIT
        {
            char charValue = str.charAt(i);
            hashCode = 31 * hashCode + charValue;
        }

        return hashCode;
    }

    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter your String :");
    	String str = sc.next();
    	
    	System.out.println(str+" hashcode from String class :"+str.hashCode());
        
    	System.out.println("..................");
    	
    	System.out.println(str+" hashcode for my class :"+CustomStringHashCode.customHashCode(str));
       	
    	sc.close();
    }
}