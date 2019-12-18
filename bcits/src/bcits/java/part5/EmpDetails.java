package bcits.java.part5;

public class EmpDetails {
	private int id;
	private String name;
	private double salary;
	public EmpDetails(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmpDetails [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
