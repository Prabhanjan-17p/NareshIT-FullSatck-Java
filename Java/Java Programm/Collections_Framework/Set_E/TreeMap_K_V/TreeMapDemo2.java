package Collections_Framework.Set_E.TreeMap_K_V;

import java.util.*;
public class TreeMapDemo2
{
    public static void main(String[] argv) 
    {
        Map<String,String> map = new TreeMap<String,String>();  
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key1", "value1");

        System.out.println(map); 
        
     }
}