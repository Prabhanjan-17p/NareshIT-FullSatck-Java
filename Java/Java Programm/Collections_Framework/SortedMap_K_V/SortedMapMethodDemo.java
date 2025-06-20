package Collections_Framework.SortedMap_K_V;

import java.util.*;
public class SortedMapMethodDemo
	{  
 public static void main(String args[])
	 {  
		SortedMap<Integer,String> map=new TreeMap<>();    
		  map.put(100,"Amit");    
		  map.put(101,"Ravi");    

		  map.put(102,"Vijay");    
		  map.put(103,"Rahul");   

		  System.out.println("First Key: "+map.firstKey());  //100
		   System.out.println("Last Key "+map.lastKey());   //103
		
		   System.out.println("headMap: "+map.headMap(102));  //100 101
		   System.out.println("tailMap: "+map.tailMap(102));  //102 103
		   System.out.println("subMap: "+map.subMap(100, 102)); //100 101 
          
	 }
 }  