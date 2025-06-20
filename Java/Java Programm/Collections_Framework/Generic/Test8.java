//Polymorphism with array

package Collections_Framework.Generic;

import java.util.*;
abstract class Animal
{
	public abstract void checkup();
}

class Dog1 extends Animal
{
	@Override
	public void checkup()
	{
		System.out.println("Dog1 checkup");
	}
}

class Cat extends Animal
{
	@Override
	public void checkup()
	{
		System.out.println("Cat checkup");
	}
}

class Bird extends Animal
{
	@Override
	public void checkup()
	{
		System.out.println("Bird checkup");
	}
}

public class  Test8
{
	public static void checkAnimals(Animal ...animals) 
	{
		for(Animal animal : animals)
		{
			animal.checkup();
		}
	}

	public static void main(String[] args) 
	{
		Dog1 []dogs={new Dog1(), new Dog1()};

		Cat []cats={new Cat(), new Cat(), new Cat()};

		Bird []birds = {new Bird(), new Bird()};
	

		checkAnimals(dogs);
		checkAnimals(cats);
		checkAnimals(birds);
	}
}
//Note :-From the above program it is clear that polymorphism(Upcasting) concept works with array.