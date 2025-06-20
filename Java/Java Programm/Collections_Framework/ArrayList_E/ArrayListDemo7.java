package Collections_Framework.ArrayList_E;

import java.util.ArrayList;
import java.util.List;

record Professor(String name, String specialization)
{
}

class Department 
{
	private String departmentName;
	private List<Professor> professors;	
	
	public Department(String departmentName)
	{
		this.departmentName = departmentName;
		professors = new ArrayList<Professor>(); //Composition
	}

	public String getDepartmentName()
	{
		return this.departmentName;
	}

	public List<Professor> getProfessors() 
	{
		return this.professors;
	}
	
	//Adding the Prof. in the department
	public void addProfessor(Professor prof)
	{
		this.professors.add(prof);
	}	
}

public class ArrayListDemo7
{
    public static void main(String[] args) 
    {
       Department dept = new Department("Computer Science");
       dept.addProfessor(new Professor("Dr. Smith", "Java"));	
       dept.addProfessor(new Professor("Dr. Alen", "Networking"));	
       dept.addProfessor(new Professor("Dr. Scott", "Database"));	
       
       System.out.println("Professors in :"+dept.getDepartmentName());
       dept.getProfessors().forEach(System.out::println);       
       
       Department department = new Department("Civil Engineering");
       department.addProfessor(new Professor("Dr. Raj", "Engineering Drawing"));	
       department.addProfessor(new Professor("Dr. Samir", "Concrete Technology"));	
       department.addProfessor(new Professor("Dr. Ankit", "Environmental Engineering"));	
       
       System.out.println("Professors in :"+department.getDepartmentName());
       department.getProfessors().forEach(System.out::println);
       
      
    }
}