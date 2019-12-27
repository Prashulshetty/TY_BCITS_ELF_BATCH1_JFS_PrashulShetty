package bcits.java.page2;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		StudentInfo s1=new StudentInfo();
		s1.setId(10);
		s1.setName("Ashin");
		s1.setMarks(565.5);
		
		StudentInfo s2=new StudentInfo();
		s2.setId(20);
		s2.setName("Prashul");
		s2.setMarks(555.5);
		
		StudentInfo s3=new StudentInfo();
		s3.setId(30);
		s3.setName("dev");
		s3.setMarks(545.5);
		
		Object obj[]= {s1,s2,s3};
		for (Object stu : obj) {
			System.out.println(stu);
		}
	}

}
