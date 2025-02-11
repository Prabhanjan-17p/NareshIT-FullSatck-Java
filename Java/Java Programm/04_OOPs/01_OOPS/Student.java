public class Student {
    int rollNumber; // Non static variable
    String studentName; // Non static variable
    String studentAddress; // Non static variable

    public void talk() {
        System.out.println("My name is :" + studentName);
        System.out.println("Roll number is :" + rollNumber);
        System.out.println("Address is :" + studentAddress);
    }

    public void writeExam() {
        System.out.println("Hello Everyone !!!, My name is :" + studentName + " every saturday we have weekly test");
        System.out.println("------------------------------------");
    }
    
}
