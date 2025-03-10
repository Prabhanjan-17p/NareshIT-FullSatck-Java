
class Test {
    int x, y;

    public Test() // All the objects will be initialized with same value
    {
        x = 0;
        y = 0;
    }

}

public class FAC {
    public static void main(String[] args) {
        Test t1 = new Test();
        // [x = 0 y = 0]
        Test t2 = new Test();
        // [x = 0 y = 0]

        System.out.println(t1);
        System.out.println(t2);
    }
}
