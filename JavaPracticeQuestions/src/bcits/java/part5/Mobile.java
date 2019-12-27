package bcits.java.part5;

public class Mobile implements Comparable {
	private int id;
	private	String name;
	private int price;
	public Mobile(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void  setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

	@Override
	public int compareTo(Object ob) {
		Mobile m =(Mobile) ob;
		return m.getPrice()-this.getPrice();
		
	}
	
}
