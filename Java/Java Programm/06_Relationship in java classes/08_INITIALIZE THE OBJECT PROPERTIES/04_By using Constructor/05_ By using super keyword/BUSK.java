
class Super {
    int x, y;

    public Super(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Sub extends Super {
    Sub() {
        super(100, 200); // Initializing the properties of super class
    }
}

public class BUSK {
    public static void main(String[] args) {
        new Sub();
    }
}
