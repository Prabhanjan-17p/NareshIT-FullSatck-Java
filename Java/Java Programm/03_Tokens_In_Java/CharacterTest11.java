class Fan 
{
   int coil  ;

   void switchOn()  
   {
   }
}

// 29-01-2025
// -----------
//Program on Octal Literal
class Test {
	public static void main(String[] args) {
		int x = 015;
		System.out.println(x); // 13
	}
}

class Test2 {
	public static void main(String[] args) {
		int x = 0Xadd;
		System.out.println(x);
	}
}

class Test3 {
	public static void main(String[] args) {
		int x = 0b101;
		System.out.println(x);
	}
}

/* By default every integral literal is of type int only */
class Test4 {
	public static void main(String[] args) {
		// byte b = 128; //error
		// System.out.println(b);

		// short s = 32768; //error
		// System.out.println(s);
	}
}

// Assigning smaller data type value to bigger data type
class Test5 {
	public static void main(String[] args) {
		byte b = 125;
		short s = b; // Automatic type casting OR Widening
		System.out.println(s);

		short x = 345;
		int y = x; // Automatic type casting OR Widening
		System.out.println(y);
	}
}

// Converting bigger type to smaller type
class Test6 {
	public static void main(String[] args) {
		short s = 127;
		byte b = (byte) s;
		System.out.println(b); // 127
	}
}

class Test7 {
	public static void main(String[] args) {
		byte x = (byte) 1L;
		System.out.println("x value  = " + x);

		long l = 29L;
		System.out.println("l value  = " + l);

		int y = (int) 18L;
		System.out.println("y value  = " + y);

	}
}

// 30-01-2025
// Wrapper claases
class Test8 {
	public static void main(String[] args) {
		Integer x = 24;
		Integer y = 24;
		Integer z = x + y;
		System.out.println("The sum is :" + z);

		Boolean b = true;
		System.out.println(b);

		Double d = 90.90;
		System.out.println(d);

		Character c = 'A';
		System.out.println(c);
	}
}

// Program to find out the range and size of Integeral Data type
class Testw {
	public static void main(String[] args) {
		System.out.println("\n Byte range:");
		System.out.println(" min: " + Byte.MIN_VALUE);
		System.out.println(" max: " + Byte.MAX_VALUE);
		System.out.println(" size :" + Byte.SIZE);

		System.out.println("\n Short range:");
		System.out.println(" min: " + Short.MIN_VALUE);
		System.out.println(" max: " + Short.MAX_VALUE);
		System.out.println(" size :" + Short.SIZE);

		System.out.println("\n Integer range:");
		System.out.println(" min: " + Integer.MIN_VALUE);
		System.out.println(" max: " + Integer.MAX_VALUE);
		System.out.println(" size :" + Integer.SIZE);

		System.out.println("\n Long range:");
		System.out.println(" min: " + Long.MIN_VALUE);
		System.out.println(" max: " + Long.MAX_VALUE);
		System.out.println(" size :" + Long.SIZE);

	}
}

// We can provide _ in integral literal [JDK 1.7]
// We can't start or end an integral literal with _ we will get compilation error.
class Test10 {
	public static void main(String[] args) {
		long mobile = 98_1234_5678L;
		System.out.println("Mobile Number is :" + mobile);
	}
}

class Test11 {
	public static void main(String[] args) {
		final int x = 127;
		byte b = x;
		System.out.println(b);
	}
}



class Testqw
{	
	public static void main(String[] args) 
        {        
	  int x = 15;
	  //Decimal to octal
	  System.out.println(Integer.toOctalString(x));
	  
	  int y = 2781;
	  //decimal to hexadecimal
	  System.out.println(Integer.toHexString(y));
	   
	  int z = 5;
	  //decimal to Binary
	  System.out.println(Integer.toBinaryString(z)); 
	  	   
	}
}

// var keyword is allowed only for local variable.
//var keyword [Introduced from java 10]
class Test13 
{
	public static void main(String[] args) 
	{
		var x = 100; //Initialization is compulsory here only
		
		//x = "NIT";  //Invalid
		
		x = 900;
		
		System.out.println(x);
			
	}
}

// 31-01-2025
// Floating Point Literal :
// ------------------------
//Programs :
// ------------
 class Test111 
{
   public static void main(String[] args) 
   {
	//    float f = 0.0; //error
	//    System.out.println(f);				
   }
}
// -------------------------------------------------------
 class Test1 
{
   public static void main(String[] args) 
   {		
	   float b = 15.29F;
	   float c = 15.25f;
	   float d = (float) 15.30;

	   System.out.println(b + " : "+c+ " : "+d);
	  
   }
}
// --------------------------------------------------------------
 class Test222
{
   public static void main(String[] args) 
   {
	   double d = 15.15;
	   double e = 15d;
	   double f = 90D;
	   
	   System.out.println(d+" , "+e+" , "+f);
   }
}
// ----------------------------------------------------------------
 class Test333
{
   public static void main(String[] args) 
   {
		double x = 0129.89;  

		double y = 0167;

		// double z = 0178; //error

	//    System.out.println(x+","+y+","+z);
   }
}
// ----------------------------------------------------------------
class Test444
{
   public static void main(String[] args) 
   {
	   double x = 0X29;  

	//    double y = 0X91.5; //error
	   
	//    System.out.println(x+","+y);
   }
}
// ---------------------------------------------------------------
 class Test555 
{
   public static void main(String[] args) 
   {
	   double d1 = 15e-3;
	   System.out.println("d1 value is :"+d1);		

	   double d2 = 15e3;
	   System.out.println("d2 value is :"+d2);		
   }
}
// ----------------------------------------------------------------
 class Test666
{
   public static void main(String[] args) 
   {
	//    double a = 0791; //Error

	   double b = 0791.0; 

	   double c = 0777;  

	   double d = 0Xdead; 
	   
	//    double e = 0Xdead.0; //Error
   }
}
// ---------------------------------------------------------------
 class Test777
{
   public static void main(String[] args) 
   {
	  double a = 1.5e3;  
	//   float b = 1.5e3;  //E 
	  float c = 1.5e3F; 	   
	  double d = 10; 	   
	//   int e = 10.0;  //E
	//   long f = 10D; //E
	//   int g = 10F; //E  
	//   long l = 12.78F; //E
   }
}
// ----------------------------------------------------------------
//Range and size of floating point literal 
 class Test888
{
   public static void main(String[] args)    
   {
	   System.out.println("\n Float range:");
	   System.out.println(" min: " + Float.MIN_VALUE);
	   System.out.println(" max: " + Float.MAX_VALUE); 
	   System.out.println(" size :"+Float.SIZE);

	   System.out.println("\n Double range:");
	   System.out.println(" min: " + Double.MIN_VALUE);
	   System.out.println(" max: " + Double.MAX_VALUE);
	   System.out.println(" size :"+Double.SIZE);
   }
} 


// boolean literal :
// -----------------
// Programs :
 class BooleanTest1
{
    public static void main(String[] args)
    {
        boolean isValid = true;   
        boolean isEmpty = false;
		
        System.out.println(isValid);
        System.out.println(isEmpty);
     }
}


 class BooleanTest2
{
    public static void main(String[] args)
    {
	// boolean c = 0; //error
        // boolean d = 1; //error
        // System.out.println(c);
        // System.out.println(d);       
    }
}

 class BooleanTest3 
{
	public static void main(String[] args) 
	{
		// boolean x = "true";  //error
		// boolean y = "false";  //error
		// System.out.println(x);
                // System.out.println(y); 
	}
}

// 01-02-2025
// ------------
// Character Literal :
// -------------------
// Programs :
 class CharacterTest1 
{
	public static void main(String[] args) 
	{
		char ch1 = 'a';
		System.out.println("ch1 value is :"+ch1);      
		
	}
}
// -------------------------------------------------------------  
 class CharacterTest2
{
	public static void main(String[] args) 
	{
		int ch = 'A';
		System.out.println("ch value is :"+ch);
		
		char ch1 = 'A';
		System.out.println("ch1 value is :"+ch1);
	}
}
// ----------------------------------------------------------------
//The UNICODE value for ? character is 63 
 class CharacterTest3 
{
	public static void main(String[] args) 
	{
		char ch1 = 63;  
		System.out.println("ch1 value is :"+ch1); //?
		
		char ch2 = 64;  
		System.out.println("ch2 value is :"+ch2); //@

		char ch3 = 65; 
		System.out.println("ch3 value is :"+ch3); //A
	}
}
// ----------------------------------------------------------------
class CharacterTest4 
{
	public static void main(String[] args) 
	{
		char ch1 = 65000;  
        System.out.println("ch1 value is :"+ch1); 

		char ch2 = 0Xadd;  		
		System.out.println("ch2 value is :"+ch2); 
		
		
	}
}

// ----------------------------------------------------------------
//Addition of two character in the form of Integer
 class CharacterTest5
{
public static void main(String txt[])
  {
	int x = 'A'; 
    int y = 'B';
    
	System.out.println(x + y); //131	
	System.out.println('A'+'B');//131 
	System.out.println("A"+"B");//AB
   } 
} 
// -----------------------------------------------------------------
//Range of UNICODE Value (65535) OR '\uffff'
class CharacterTest6 
{
	public static void main(String[] args) 
	{
		char ch1 = 65535; 
		System.out.println("ch value is :"+ch1);

		// char ch2 = 65536; //error
		// System.out.println("ch value is :"+ch2);
	}
}
// ----------------------------------------------------------------
//WAP in java to describe unicode representation of char in hexadecimal format
 class CharacterTest7 
{
	public static void main(String[] args) 
	{
		int ch1 = '\u0000'; 
		System.out.println(ch1);

		int ch2 = '\uffff';   
		System.out.println(ch2);

		char ch3 = '\u0041'; 
                System.out.println(ch3); //A  

		char ch4 = '\u0061';
		System.out.println(ch4); //a
	}
}
// -----------------------------------------------------------------
class CharacterTest8 
{
	public static void main(String[] args) 
	{
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';

		System.out.println("c1 = "+c1+", c2 ="+c2+", c3 ="+c3);
	}
}
// -----------------------------------------------------------------
class Test9 
{
	public static void main(String[] args) 
	{
		int x = 'A';
		int y = '\u0041';
		System.out.println("x = "+x+" y ="+y);
	}
}
// ----------------------------------------------------------------
//Every escape sequence is char literal
class CharacterTest10 
{
	public static void main(String [] args) 
	{
		char ch ='\n';
		System.out.println("Hello");
		System.out.println(ch);
		
	}
}
// -------------------------------------------------------------------
public class CharacterTest11  
{
	public static void main(String[] args) 
	{
		System.out.println("Min Value :"+(int)Character.MIN_VALUE);
		System.out.println("Max Value :"+(int)Character.MAX_VALUE);
		
		int min = '\u0000';
		int max = '\uffff';
       
		System.out.println("Min Value :"+min);
		System.out.println("Max Value :"+max);
		
		
	}
}


// String Literal :
// ----------------