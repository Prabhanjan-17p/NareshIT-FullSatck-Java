package Collections_Framework.Generic;

import java.util.*;
public class Test13 
{
	public static void main(String[] args) 
	{
		List<? extends Number> list1 = new ArrayList<Double>();

		List<? super String> list2 = new ArrayList<Object>();

		List<? super Gamma> list3 = new ArrayList<Alpha>();

		List list4 = new ArrayList();
		
		System.out.println("yes");
	}
}

class Alpha
{
}
class Beta extends Alpha
{
}
class Gamma extends Beta
{
}