
public class StudentDemo {
    public static void main(String[] args) {
        Student  raj = new Student();
		//Initializing the properties through reference variable
        raj.rollNumber = 111;
        raj.studentName = "Raj";
        raj.studentAddress ="Ameerpet";
        
        //calling the behavior
        raj.talk();
        raj.writeExam();
        
        //2nd Object for priya

        Student priya = new Student();
        //Initializing the properties through reference variable
        priya.rollNumber = 222;
        priya.studentName = "Priya";
        priya.studentAddress = "S R Nagar";
        
        //calling the Behavior
        priya.talk();
        priya.writeExam();
    }
}
