
//ELC Class--------------------------------------------------------
public class VariableDeclaration {

	public static void main(String[] args) {
		Student raj = new Student();
		raj.setStudentData(101, "Raj", "Ameerpet");
		raj.showStudentData();

		System.out.println("...............");
		Student priya = new Student();
		priya.setStudentData(102, "Priya", "S.R Nagar");
		priya.showStudentData();

	}

}



//BLC Class--------------------------------------------------------
class Student {
	int rollNumber;
	String studentName;
	String studentAddress;
	static String collegeName = "NIT"; // In this case only one variable create for all the object
	static String courseName = "Java"; // In this case only one variable create for all the object

	public void setStudentData(int roll, String name, String address) {
		rollNumber = roll;
		studentName = name;
		studentAddress = address;
	}

	public void showStudentData() {
		System.out.println("Roll Number is :" + rollNumber);
		System.out.println("Name is :" + studentName);
		System.out.println("Address is :" + studentAddress);
		System.out.println("College Name is :" + collegeName);
		System.out.println("Course is :" + courseName);
	}
}
