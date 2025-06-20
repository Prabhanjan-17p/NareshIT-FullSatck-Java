package Collections_Framework.Set_E.Hashtable_K_V;

import java.util.*;
public class HashtableDemo1
{  
   public static void main(String args[])
	{  
    Hashtable<Integer,String> map=new Hashtable<>();          
     map.put(1,"Priyanka");    
     map.put(2,"Ruby");   
     map.put(3,"Vibha");    
     map.put(4,"Kanchan");
	
	 map.putIfAbsent(5,"Bina");  
	 map.putIfAbsent(24,"Pooja");
	 map.putIfAbsent(26,"Ankita");     
    
     map.putIfAbsent(1,"Sneha");  
     System.out.println("Updated Map: "+map); 
 }  
} 