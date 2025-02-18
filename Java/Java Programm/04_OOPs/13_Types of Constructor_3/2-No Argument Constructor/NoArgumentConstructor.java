//ELC Class------------------------------
public class NoArgumentConstructor {
    public static void main(String[] args) {
        Person scott = new Person();
		System.out.println(scott);
		
		System.out.println("..........");
		
		Person smith = new Person();
		System.out.println(smith);
    }
}



//BLC Class-----------------------------
class Person {
	private int personId;
	private String personName;
	private int personAge;

	public Person() // No Argument Constructor
	{
		this.personId = 101;
		this.personName = "Scott";
		this.personAge = 24;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + "]";
	}

}