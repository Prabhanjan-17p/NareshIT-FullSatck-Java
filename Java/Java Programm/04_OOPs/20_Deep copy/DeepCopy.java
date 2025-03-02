/*
 * Deep Copy --> 2 object created 1st class all the content copy by 2nd class
 * 			 --> if any changes in one object it does not afect another object
 */

class Laptop {
	private String laptopBrand;
	private double laptopPrice;

	public Laptop(String laptopBrand, double laptopPrice) {
		super();
		this.laptopBrand = laptopBrand;
		this.laptopPrice = laptopPrice;
	}

	public Laptop() {
	}

	@Override
	public String toString() {
		return "Laptop [laptopBrand=" + laptopBrand + ", laptopPrice=" + laptopPrice + "]";
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}

	public double getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

}

public class DeepCopy {
	public static void main(String[] args) {
		Laptop obj1 = new Laptop("HP", 90000);
		Laptop obj2 = new Laptop();

		obj2.setLaptopBrand(obj1.getLaptopBrand());
		obj2.setLaptopPrice(obj1.getLaptopPrice());

		System.out.println(obj1);
		System.out.println(obj2);

		System.out.println("====================");

		// Modifying Object1 data
		obj1.setLaptopBrand("Apple");
		obj1.setLaptopPrice(150000);

		System.out.println(obj1);
		System.out.println(obj2);

	}
}