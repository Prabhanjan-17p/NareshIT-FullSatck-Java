public class MethodChaingDemo2 {

	public static void main(String[] args) 
	{
		String str = "Hyderabad";
		int length = str.concat(" is an IT city").toUpperCase().length();
		System.out.println("Length is :"+length);
	}

}