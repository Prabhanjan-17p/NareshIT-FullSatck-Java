
//Three Ways to create the String Object
public class StringTest1 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello World";       //Literal
		System.out.println(s1);

		String s2 = new String("Ravi"); //Using new Keyword
		System.out.println(s2);

		char s3[] = {'H','E','L','L','O'}; //Character Array 
		System.out.println(s3);

	}
}