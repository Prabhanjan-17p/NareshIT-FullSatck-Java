/*
 * Shallow Copy --> 1 Object created but more than 1 reference variable , refer the same object 
 * 				--> if any changes in one reference changes the object it afect all the reference
 */

class Product {
	private int productId;
	private String productName;
	private double productPrice;

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

}

public class ProductDemo {

	public static void main(String[] args) {
		Product p1 = new Product(111, "M Series", 22000);
		System.out.println(p1);

		Product p2 = p1;
		System.out.println(p2);

		System.out.println("..................");
		p2.setProductId(222);
		p2.setProductName("X Series");
		p2.setProductPrice(25000);

		System.out.println("After Modification");
		System.out.println(p1);
		System.out.println(p2);

	}
}
