package Collections_Framework.ArrayList_E;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo5
{
    public static void main(String[] args)
    {        
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Hyderabad");
        cities.add("Delhi");
        cities.add("Banglore");
        cities.add("Chennai");
        
        System.out.println("Before sorting: " + cities);        
        
        
        cities.sort((s1,s2)-> s1.compareTo(s2));
        System.out.println("In Ascending Order :"+cities);          

       
        Collections.sort(cities, (s1,s2)-> s2.compareTo(s1));
        System.out.println("In Descending Order :"+cities);
      

    }
}