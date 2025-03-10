
class Test {
    int x, y;

    public Test() {
        System.out.println(x); // 100
        System.out.println(y); // 200
    }

    // Instance block
    {
        x = 100;
        y = 200;
    }
}

public class BUIB {
    public static void main(String[] args) {

    }
}
