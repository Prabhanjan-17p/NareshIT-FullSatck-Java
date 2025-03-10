class Employee {
   int empID;
   String empName;
   
   public Employee(int empID, String empName) {
      this.empID = empID;
      this.empName = empName;
   }

   public int getEmployeeId() {
      return empID;
   }

   public String getEmployeeName() {
      return empName;
   }
   
   
}


class Manager {
   private int managerId;
   private String managerName;

   public Manager(Employee emp) {
      this.managerId = emp.getEmployeeId();
      this.managerName = emp.getEmployeeName();

      System.out.println(managerId+" : "+managerName);
   }
}

public class TAC {
   public static void main(String[] args) {
      Employee e = new Employee(1, "kanah");

      Manager m = new Manager(e);

      System.out.println(m);
   }
}

// Here with the help of Object reference (Employee class) we are initializing
// the properties of Manager class. (Copy Constructor)