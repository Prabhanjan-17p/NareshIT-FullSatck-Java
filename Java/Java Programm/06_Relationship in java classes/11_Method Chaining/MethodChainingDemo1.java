public class MethodChainingDemo1 {

	public static void main(String[] args) 
	{
		String str = "india";
		char ch = str.toUpperCase().concat(" is great").charAt(0);
        System.out.println(ch);
	}

}