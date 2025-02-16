
/*
----while creating an object.
    In java, Whenever we create an object, a separate copy of all the instance variables will be created with each and every object.

*/

public class Non_Static_Test
{
   int x = 100;
   
   public static void main(String [] args)
   {
       Non_Static_Test t1 = new Non_Static_Test(); // t1 is different 
       Non_Static_Test t2 = new Non_Static_Test(); // t2 is different 
       
       ++t1.x;   --t2.x;       // That's so why value never effect, When one object value is update never affect another value 
       
       System.out.println(t1.x); //101       
       System.out.println(t2.x); //99 
   }
}