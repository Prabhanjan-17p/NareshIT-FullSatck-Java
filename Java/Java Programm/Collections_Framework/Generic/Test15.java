package Collections_Framework.Generic;

//E stands for Element type
class Fruit    
{
}
class Apple extends Fruit   //Fruit is super, Apple is sub class
{
	@Override
	public String toString()
	{
		return "Apple";
	}
}

class Basket<E>   //E -> Fruit
{
	private E element;
	
	public void setElement(E element) //Fruit element 
	{
		this.element = element;
	}
	
	public E getElement()
	{
		return this.element;
	}	
}

public class Test15
{
	public static void main(String[] args) 
	{
	   Basket<Fruit> basket = new Basket<>();	
	   basket.setElement(new Apple());
	   Apple apple = (Apple) basket.getElement();
	   System.out.println(apple);
	   
	   System.out.println("............");
	   basket = new Basket<>();
	   basket.setElement(new Mango());
	   Mango mango = (Mango) basket.getElement();
	   System.out.println(mango);
	   
	}
}

class Mango extends Fruit
{
	@Override
	public String toString()
	{
		return "Mango";
	}
}