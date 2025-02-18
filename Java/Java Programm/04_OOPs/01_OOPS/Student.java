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

class StudentDemo {
    public static void main(String[] args) {
        Student raj = new Student();
        // Initializing the properties through reference variable
        raj.rollNumber = 111;
        raj.studentName = "Raj";
        raj.studentAddress = "Ameerpet";

        // calling the behavior
        raj.talk();
        raj.writeExam();

        // 2nd Object for priya

        Student priya = new Student();
        // Initializing the properties through reference variable
        priya.rollNumber = 222;
        priya.studentName = "Priya";
        priya.studentAddress = "S R Nagar";

        // calling the Behavior
        priya.talk();
        priya.writeExam();
    }
}
