
class Test {
    int x, y;

    public Test(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class SAC {
    public static void main(String[] args) {
        Test t1 = new Test(12, 78);
        // [x = 12 y = 78]
        Test t2 = new Test(15, 29);
        // [x = 15 y = 29]

        System.out.println(t1);
        System.out.println(t2);
    }
}

// Note - This is the best way to initialize our instance variable because
// variable initialization and variable re-initialization both will be done in
// the same line as well as all the objects will be initialized with different
// values.
