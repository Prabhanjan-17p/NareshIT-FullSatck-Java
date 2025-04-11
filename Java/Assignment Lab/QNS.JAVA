interface Course 
{ 
String name = "Naresh"; 
int duration = 1; 
void addCourse(); 
abstract void addDuration(); 
abstract void addfaculty(); 
} 
class Impl implements Course 
{ 
@Override 
public void addCourse() { 
System.out.println("Cource Added"); 
} 
@Override 
public void addDuration() { 
System.out.println("Add Duration"); 
} 
@Override 
public void addfaculty() { 
System.out.println("Add Faculty"); 
} 
} 
public class Abstract 
{ 
public static void main(String[] args) {
1 
Course course = new Impl(); 
course.addCourse(); 
Impl impl = new Impl(); 
impl.addDuration(); 
impl.addfaculty(); 
} 
} 