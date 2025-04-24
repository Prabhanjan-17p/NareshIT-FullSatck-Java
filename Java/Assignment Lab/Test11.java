// class MyThreadA extends Thread {
// 	String s;

// 	public void run(String s) {
// 		this.s = s;
// 		for (;;) {
// 			System.out.println("s will be printed :" + s);
// 		}
// 	}
// }

// class MyThreadB extends Thread {
// 	String t;

// 	public void run(String t) {
// 		this.t = t;
// 		for (;;) {
// 			System.out.println("t will be printed :" + t);
// 		}
// 	}
// }

// public class Test11 {
// 	public static void main(String[] args) {
// 		MyThreadA t1 = new MyThreadA();
// 		MyThreadB t2 = new MyThreadB();
// 		t1.start();
// 		t2.start();
// 	}}ANS-

// 	Nothing will
// 	be print

// 	Q12)

// 	public class Test12 extends Thread {
// 		public static void main(String argv[]) {
// 			Test12 b = new Test12();
// 			b.run(); // Nothing Will be print here
// 			b.start(); // it will be call Non-static method of Test12 Class
// 		}

// 		public void start() {
// 			for (int i = 0; i < 10; i++) {
// 				System.out.println("Value of i = " + i);
// 			}
// 		}
// 	}ANS-

// 	Value of i=0
// Value of i=1
// Value of i=2
// Value of i=3
// Value of i=4
// Value of i=5
// Value of i=6
// Value of i=7
// Value of i=8
// Value of i=9

// 	Q13)

// class Test58 
// {
// 	public static void main(String[] args) 
// 	{
		
// 	}
// 	System.out.println("Hello World!");
// }ANS-

// 	Compile Time
// 	ERROR

// Q14)

// 	class Test61 {
// 		public static void main(String[] args) {
// 			Runnable r1 = new Runnable() {
// 				public void run() {
// 					try {
// 						while (true) {
// 							System.out.println("Hello, world!");
// 							Thread.sleep(1000);
// 						}
// 					} catch (InterruptedException iex) {
// 					}
// 				}
// 			};

// 			Runnable r2 = new Runnable() {
// 				public void run() {
// 					try {
// 						while (true) {
// 							System.out.println("Goodbye, " + " Beautiful world!");
// 							Thread.sleep(2000);
// 						}
// 					} catch (InterruptedException iex) {
// 					}
// 				}
// 			};

// 			Thread thr1 = new Thread(r1);
// 			Thread thr2 = new Thread(r2);
// 			thr1.start();
// 			thr2.start();
// 		}
// }