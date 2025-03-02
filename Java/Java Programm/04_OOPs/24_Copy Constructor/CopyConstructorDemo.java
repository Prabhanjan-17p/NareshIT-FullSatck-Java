class Product {
	private int productId;
	private String productName;

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public Product(Product prod) // prod = p1
	{
		this.productId = prod.productId;
		this.productName = prod.productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
}

public class CopyConstructorDemo {

	public static void main(String[] args) {
		Product p1 = new Product(111, "Laptop");
		Product p2 = new Product(p1);

		System.out.println(p1);
		System.out.println(p2);

	}

}