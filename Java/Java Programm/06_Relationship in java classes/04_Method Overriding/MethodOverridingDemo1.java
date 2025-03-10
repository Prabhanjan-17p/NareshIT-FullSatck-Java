
class Alpha
{
	@Override
	public String toString() 
	{
		return "Alpha []";
	}	

	void add(){
		System.out.println("class Alpha");
	}
}

class Beta extends Alpha
{
	@Override
	public String toString() 
	{
		return "Beta []";
	}	

	void add(){ // method overriding
		System.out.println("class Beta");
	}
}

class Gamma extends Beta
{
	@Override
	public String toString() 
	{
		return "Gamma []";
	}	

	void add(){ // method overriding
		System.out.println("class Gamma");
	}
}

public class MethodOverridingDemo1 {

	public static void main(String[] args) 
	{
		Gamma g = new Gamma();
		System.out.println(g);
	}

}