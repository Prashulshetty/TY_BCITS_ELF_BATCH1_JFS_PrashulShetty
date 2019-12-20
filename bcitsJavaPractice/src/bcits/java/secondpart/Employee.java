package bcits.java.secondpart;

public class Employee implements Comparable {
	int id;
	String name;
	String Department;
	double salary;
	
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.Department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee details [id=" + id + ", name=" + name + ", Department=" + Department + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		
		return id;
	}

	@Override
	public int compareTo(Object o) {
		return this.hashCode()-o.hashCode();
		
	}
	
}
