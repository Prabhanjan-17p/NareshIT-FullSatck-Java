Problem Statement:

You are tasked with creating an education institute course enrollment system using Java. The system should provide courses and offers to students, allowing them to view available courses, ongoing offers, and enroll in their preferred courses.

Classes:
Take one BLC class Course

Attributes:

-> courseId (int): Unique identifier for the course.

-> courseName (String): Name of the course.

-> corseFee (double): Fee for the course.



Methods:

-> Parameterized Constructor to initialize the instance variable.

-> Generate getters for all field

-> Override toString() method


class Offer:

Attributes:

-> offerText (String): Description of the special offer provided by the education institute.



Methods:

-> Offer(String offerText): Constructor to initialize the offer description.

-> getOfferText(): Returns the offer description.



class EducationInstitute:

Attributes:

-> courses (Course[]): An array to store the available courses.

-> offers (Offer[]): An array to store ongoing offers.



Methods:

-> EducationInstitute(): Constructor to initialize courses and offers.

-> getCourses(): Returns the array of available courses.

-> getOffers(): Returns the array of ongoing offers.

-> enrollStudentInCourse(int courseId, String studentName): Simulates the enrollment process and prints a message when a student -> enrolls in a course.



class Student:

Attributes:

-> name (String): Name of the student.

-> institute (EducationInstitute): Reference to the education institute where the student interacts.



Methods:

-> Student(String name, EducationInstitute institute): Constructor to initialize the student with their name and the education institute reference.

-> viewCoursesAndFees(): Displays the available courses and their fees.

-> viewOffers(): Displays the ongoing offers.

-> enrollInCourse(int courseId): Enrolls the student in the specified course using the education institute’s enrollment process.



class Main :



The EducationInstituteApp class is the main program that simulates concurrent student interactions using threads. 

It creates an education institute, initializes students, and allows them to view course details, ongoing offers, and enroll in courses concurrently without disturbing the execution flow of each thread.



Instructions for Students:

-> Implement the above classes and their methods following the given specifications.

-> Create an instance of EducationInstitute, and initialize courses and offers with hardcoded data for simplicity.

-> Create two students: Virat and Dhoni. Allow them to view available courses, check ongoing offers, and enroll in their preferred courses concurrently using threads.

-> Use the Thread class to simulate concurrent student interactions. Ensure that the system provides a responsive user experience for multiple students.

-> Test your program with multiple executions and verify that students can view course details, offers, and enroll without conflicts.

-> Feel free to enhance the program with additional features or error handling to further improve its functionality.



[Note : Include appropriate comments and use meaningful variable names to make your code more readable and understandable.]



Sample Output :



Available Courses:

1. Mathematics - Fee: Rs.1000.0

2. Science - Fee: Rs.1200.0

3. English - Fee: Rs.900.0

Ongoing Offers:

Special discount: Get 20% off on all courses!

Limited time offer: Enroll in any two courses and get one course free!

Virat has enrolled in the course: Mathematics



Available Courses:

1. Mathematics - Fee: Rs.1000.0

2. Science - Fee: Rs.1200.0

3. English - Fee: Rs.900.0

Ongoing Offers:

Special discount: Get 20% off on all courses!

Limited time offer: Enroll in any two courses and get one course free!

Dhoni has enrolled in the course: Science