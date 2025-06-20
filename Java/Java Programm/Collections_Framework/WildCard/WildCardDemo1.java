package Collections_Framework.WildCard;

import java.util.ArrayList;

class Animal
{
	
}

class Dog extends Animal
{
}

class Horse extends Animal
{
}

class Rabbit extends Animal
{
}

public class WildCardDemo1
{

	public static void main(String[] args)
	{
	   ArrayList<? super Dog> list = new ArrayList<Object>();
	   list.add(new Dog());
	   
	   
	  ArrayList<? extends Animal> list1 = new ArrayList<Horse>();
//      list1.add(new Horse()); //Invalid
	}

}