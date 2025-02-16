// ELC Class-------------------------------------------------------
public class Manager {
	int managerId;
	String managerName;

	public void setManagerData(int managerId, String managerName) {
		//In this local variable , method variable and class variable all name are same that so why class lavel value can't access , if you access class lavel variable then use "this" keyword
		
		this.managerId = managerId;  // Access for class variable 
		this.managerName = managerName;

	}

	public void getManagerData() {
		System.out.println("Manager Id is :" + managerId);
		System.out.println("Manager Name is :" + managerName);
	}

}


// BLC Class---------------------------------------------------
class ManagerDemo {

	public static void main(String[] args) {
		Manager alen = new Manager();
		alen.setManagerData(111, "Alen");
		alen.getManagerData();
	}

}
