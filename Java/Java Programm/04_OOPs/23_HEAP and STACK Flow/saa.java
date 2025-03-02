class Demo {
    int x;
    int y;

    void m1(Demo d) {
        x = x + 1;
        y = y + 2;

        d.x = d.x + 3;
        d.y = d.y + 4;
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1.m1(d2);

        System.out.println(d1.x + "... " + d1.y);
        System.out.println(d2.x + "... " + d2.y);

        d2.m1(d1);
        System.out.println(d1.x + "... " + d1.y);
        System.out.println(d2.x + "... " + d2.y);

        d1.m1(d1);
        System.out.println(d1.x + "... " + d1.y);
        System.out.println(d2.x + "... " + d2.y);

        d2.m1(d2);
        System.out.println(d1.x + "... " + d1.y);
        System.out.println(d2.x + "... " + d2.y);
    }
}