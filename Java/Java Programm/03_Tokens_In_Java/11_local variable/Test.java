
public class Test {

    /*
     * Inside a method / block a local variable create only
     */
    public void accept() {
        int x = 100; // x is a local variable
        System.out.println("local variable use in x = "+x);
    }

    /*
     * in case fo local variable we can not used any types of modifer except " Final "
     * except "final" keyword use other modifer it will gives error 
     */
    public void accept1() {
        final int x = 100; // final is a valid modifier
        System.out.println("Final use in x = "+x);
    }

    /*
     * before used a local variable we most have to declare it 
     * if you 1st call then declare it will gives error
     */
    public void m1() {
        // System.out.println(x); //error
        // int x = 100;
    }

}
