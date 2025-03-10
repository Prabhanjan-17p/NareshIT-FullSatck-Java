
class Hello {
}

public class ACL2 {
    public static void main(String[] args) {
        System.out.println(
                "Super class of Platform class loader is " + Hello.class.getClassLoader().getParent().getParent()); // null
    }
}

// Note :- Here we will get the output as null because it is built in class
// loader for JVM which is used for internal purpose (loading only predefined
// .class file) so implementation is not provided hence we are getting null.
