
public class Static_Test {
    static int x = 100;

	public static void main(String[] args)
	{
        //Different 2 Object created but "Refer same variable"
        // means "single of copy created" and same change in same object
		Static_Test d1 = new Static_Test(); 
		Static_Test d2 = new Static_Test();
		
		// ++d1.x;   ++d2.x; // same change in object 
		
		// System.out.println(d1.x); //102
		// System.out.println(d2.x); //102


        //2-Object
        System.out.println(d1);
        System.out.println(d2);
	}
}
