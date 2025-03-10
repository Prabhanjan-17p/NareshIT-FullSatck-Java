class Parent {
	public void house() {
		System.out.println("3 BHK HOUSE");
	}
}

class Child extends Parent {
	public void car() {
		System.out.println("BMW Car");
	}
}

public class SingleLevelDemo {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.house();
		c1.car();
	}

}