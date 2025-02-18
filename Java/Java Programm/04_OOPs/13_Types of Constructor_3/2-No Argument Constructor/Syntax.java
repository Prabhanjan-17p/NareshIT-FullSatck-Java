public class Syntax {

    // It is written by the user
    public Syntax() {
        System.out.println("it is No Argument Constructor with same class");
    }

    public static void main(String[] args) {

        //At the time of creating object call the constructor 
        Example e = new Example();
        Syntax s = new Syntax();

        System.out.println(e);
        System.out.println(s);
    }
}

class Example {

    // It is written by the user
    public Example() {
        System.out.println("it is No Argument Constructor - With different class");
    }

}