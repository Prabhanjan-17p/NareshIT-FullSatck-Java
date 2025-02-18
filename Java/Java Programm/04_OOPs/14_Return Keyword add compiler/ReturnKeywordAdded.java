//ELC Class---------------------
public class ReturnKeywordAdded {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.m1());
        s1.m2();
    }
}

// BLC Class----------------------
class Student {
    public Student() {
        System.out.println("Student Constructor");
        return;
    }

    public int m1() {
        System.out.println("It is a method");
        return 10;
    }

    public void m2(){
        System.out.println("Non return type method");

        //return; // by-default compiler can add the return type (if you can not add or write ) 
    }

}


/*
    javap -c ReturnKeywordAdded.class after run this
    -----------------------------------------------

 * D:\NareshIT-FullSatck-Java\NareshIT-FullSatck-Java\Java\Java Programm\04_OOPs\14_Return Keyword add compiler>javap -c ReturnKeywordAdded.class
Compiled from "ReturnKeywordAdded.java"
public class ReturnKeywordAdded {
  public ReturnKeywordAdded();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: new           #7                  // class Student
       3: dup
       4: invokespecial #9                  // Method Student."<init>":()V
       7: astore_1
       8: getstatic     #10                 // Field java/lang/System.out:Ljava/io/PrintStream;
      11: aload_1
      12: invokevirtual #16                 // Method Student.m1:()I
      15: invokevirtual #20                 // Method java/io/PrintStream.println:(I)V
      18: aload_1
      19: invokevirtual #26                 // Method Student.m2:()V
      22: return


      Note - It Show the void have return type
}
 */