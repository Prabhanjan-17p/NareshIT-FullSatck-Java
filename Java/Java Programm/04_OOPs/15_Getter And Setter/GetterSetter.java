public class GetterSetter
{
  private double salary;   //[Data hiding]
   
  public GetterSetter(double salary)
  {
    this.salary = salary;
  }
 
  public void setSalary(double salary){  //setter                     
    this.salary = salary;
  }
   
  public double getSalary() //getter
  {                                                   
     return this.salary;
  }
}