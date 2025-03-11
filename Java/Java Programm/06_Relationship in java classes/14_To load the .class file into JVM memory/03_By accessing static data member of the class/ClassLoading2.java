
class Alpha {
    int x = 100;
}

class Beta extends Alpha {
    int x = 200; // Variable Hiding

    public static void access() {
        Beta b1 = new Beta();
        System.out.println("x value is :" + b1.x);

        Alpha a1 = b1;
        System.out.println("x value is :" + a1.x);

    }
}

public class ClassLoading2 {
    public static void main(String[] args) {
        Beta.access();
    }

}
