class Test {
	public static final int MAX_VALUE = 120;

	static {
		System.out.println("Static Block");
	}
}

public class CompileTimeConstantDemo1 {
	public static void main(String[] args) {
		System.out.println(Test.MAX_VALUE);
	}
}

// Note : class is not loaded hence static block will not be executed.