class Hello {
}

public class ACL1 {
	public static void main(String[] args) {
		System.out.println("Super class of Application class loader is " + Hello.class.getClassLoader().getParent());
	}
}

/*
 * getClassLoader() is a predefined non static method of java.lang.Class class
 * and the return type of this method is java.lang.ClassLoader
 * 
 * public ClassLoader getClassLoader()
 * ------------------------------------------------------------
 * ClassLoader which is an abstract class has provided a predefined non static
 * methdo called getParent(), the return type of this methdo is ClassLoader.
 * 
 * public ClassLoader getParent() :
 * ---------------------------------
 * It will provide the name of the super class and will ClassLoader object.
 * 
 */
