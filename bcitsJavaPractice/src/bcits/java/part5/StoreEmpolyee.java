package bcits.java.part5;

import java.util.ArrayList;

import bcits.java.secondpart.Employee;

public class StoreEmpolyee {

	public static void main(String[] args) 
	{
	    Employee e1 = new Employee(10,"shetty1","developer1",15000);
	    Employee e2 = new Employee(20,"shetty2","developer2",15000);
	    Employee e3 = new Employee(30,"shetty3","developer3",15000);
ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		
		int i=0;
		
		while(i < list.size()) {
			
			System.out.println(list.get(i));
			i++;
		}
		
	}
}


