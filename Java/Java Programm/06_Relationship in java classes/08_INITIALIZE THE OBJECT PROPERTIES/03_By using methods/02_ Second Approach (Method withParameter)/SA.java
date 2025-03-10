class Test {
    int x, y;

    public void setData(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class SA {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.setData(12, 78);
        // [x = 12 y = 78]
        Test t2 = new Test();
        t2.setData(15, 29);
        // [x = 15 y = 29]
    }
}

// Note - Here the Drawback is initialization and re-initialization both are done in two different lines so Constructor introduced.