
class Student {
	protected int id;
	protected String name;
	protected String address;

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
}

class Science extends Student {
	protected int phyMarks;
	protected int cheMarks;

	public Science(int id, String name, String address, int phyMarks, int cheMarks) {
		super(id, name, address);
		this.phyMarks = phyMarks;
		this.cheMarks = cheMarks;
	}
}

class PCM extends Science {
	protected int mathMarks;

	public PCM(int id, String name, String address, int phyMarks, int cheMarks, int mathMarks) {
		super(id, name, address, phyMarks, cheMarks);
		this.mathMarks = mathMarks;
	}

	@Override
	public String toString() {
		return "PCM [id=" + id + ", name=" + name + ", address=" + address + ", phyMarks=" + phyMarks + ", cheMarks="
				+ cheMarks + ", mathMarks=" + mathMarks + "]";
	}

	public void totalMarks() {
		int total = this.phyMarks + this.cheMarks + this.mathMarks;
		System.out.println("Total Marks is :" + total);
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		PCM p = new PCM(111, "Scott", "Ameerpet", 90, 80, 92);
		System.out.println(p);
		p.totalMarks();
	}

}