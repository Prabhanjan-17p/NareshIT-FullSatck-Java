//WAP in java to describe unicode representation of char in hexadecimal format
public class Test7 
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