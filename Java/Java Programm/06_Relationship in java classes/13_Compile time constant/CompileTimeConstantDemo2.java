class Demo {
	public static final int MIN_VALUE = m1();

	public static int m1() {
		return 1;
	}

	static {
		System.out.println("Static Block");
	}
}

public class CompileTimeConstantDemo2 {
	public static void main(String[] args) {
		System.out.println(Demo.MIN_VALUE);
	}
}
