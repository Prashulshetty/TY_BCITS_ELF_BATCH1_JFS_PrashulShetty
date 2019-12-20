package bcits.java.part5;

public class CountObject {
	static int count =0;
	public CountObject()
	{
		count++;
	}

	public static void main(String[] args) {
		CountObject obj1 = new CountObject();
		CountObject obj2 = new CountObject();
		CountObject obj3 = new CountObject();
		
		System.out.println("Number of object created is "+count);

	}

}
