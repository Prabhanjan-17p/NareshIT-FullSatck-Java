/*public class Syntax
{
    public Calculate(int x, int y)
    {
    }

    public Calculate(int x, int y, int z)  //Constructor Overloading
    {
    }
}*/

// Calculate.java
// ---------------

class Calculate {
  public Calculate(int x) // 2
  {
    this("Data", "Base");
    System.out.println("Square of " + x + " is :" + (x * x));
  }

  public Calculate(int x, int y) // 1
  {
    this(5);
    System.out.println("Sum of " + x + " and " + y + " is :" + (x + y));
  }

  public Calculate(String x, String y) // 3
  {
    System.out.println("String after concatenation :" + (x + y));
  }

}

// ConstructorOverloading.java
// ---------------------------

public class ConstructorOverloading {

  public static void main(String[] args) {
    new Calculate(10, 20); // Anonymous OR Nameless object

  }

}