public class Exam39 extends Thread {

   public void run() {
      try {
         Thread.sleep(100);
      } catch (Exception e) {
         System.out.println("Thread terminated");
      }
      for (int i = 1; i <= 5; i++)
         System.out.println(i);
   }

   public static void main(String args[]) {
      Exam39 t1 = new Exam39();
      t1.start();

      t1.interrupt();

   }
}