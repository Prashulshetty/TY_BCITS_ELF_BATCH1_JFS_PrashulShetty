package bcits.java.secondpart;

import java.util.Scanner;

public class SearchEngine {

	public static void main(String[] args) {
		Employee e1 = new Employee(10,"Ashin","development",15000);
		Employee e2 = new Employee(20,"dev","development",15000);
		Employee e3 = new Employee(30,"Prashul","development",15000);
		
		Employee[] emp = {e1,e2,e3};
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("Search By :\n 1)name \n 2)id \n select the option: ");
		int n = s1.nextInt();
		if(n == 1) {
			System.out.println("Enter the name to be search :");
			search(emp,s2.nextLine());
		} else if(n == 2) {
			System.out.println("Enter the id to be search :");
			search(emp,s2.nextInt());
		} else {
			System.out.println("Select valid option...");
		}
	}
		public static  void search(Employee[] emp,String name) 
		{
			int i=0;
			int found=0;
			while(i < emp.length) {
				if(name.equals(emp[i].name)) {
					System.out.println(emp[i]);
					found=1;
					break;
				} else {
					i++;
				}
			}
			if(found != 1) {
				System.out.println("details not found..");
			}	
	}
		public static  void search(Employee[] emp,int id) 
		{
			int i=0;
			int found=0;
			while(i < emp.length) {
				if(id == emp[i].id) {
					System.out.println(emp[i]);
					found=1;
					break;
				} else {
					i++;
				}
			}
			if(found != 1) {
				System.out.println("details not found..");
			}	
	}

}
