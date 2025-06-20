package Collections_Framework.Generic;

import java.util.ArrayList;
import java.util.List;

public class Test4
{
	public static void main(String [] args)
	{
		Dog dog = new Dog();
		Dog d1 = dog.getDogList().get(0);
		System.out.println(d1);
		
	}
}
class Dog
{
	public List<Dog> getDogList()
	{
		ArrayList<Dog> listOfDog = new ArrayList<>();
		listOfDog.add(new Dog());
		listOfDog.add(new Dog());
		listOfDog.add(new Dog());
		
		return listOfDog;
		
	}
}
/*
NOte : This method return type is type safe List of Dog (List<Dog>)object so type casting is not required, If we use without generic(List ) then
type casting is required
Dog d1 = (Dog) dog.getDogList().get(0);
 */