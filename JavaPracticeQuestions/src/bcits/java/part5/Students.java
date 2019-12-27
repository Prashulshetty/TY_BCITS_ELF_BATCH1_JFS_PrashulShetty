/* 5 student object*/

package bcits.java.part5;
import java.util.ArrayList;

import bcits.java.page2.StudentInfo;

public class Students {

	public static void main(String[] args) {

		StudentInfo s1 = new StudentInfo();
		s1.setId(10);
		s1.setName("shetty");
		s1.setMarks(560);
		
		StudentInfo s2 = new StudentInfo();
		s2.setId(12);
		s2.setName("ashin");
		s2.setMarks(490);
		
		StudentInfo s3 = new StudentInfo();
		s3.setId(18);
		s3.setName("dev");
		s3.setMarks(586);
		
		StudentInfo s4 = new StudentInfo();
		s4.setId(13);
		s4.setName("ms");
		s4.setMarks(350);
		
		StudentInfo s5 = new StudentInfo();
		s4.setId(30);
		s4.setName("aa");
		s4.setMarks(450);
		ArrayList<StudentInfo> slist = new ArrayList<StudentInfo>();
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		
		int i=0;
		while(i < slist.size()) {
			
			System.out.println(slist.get(i));
			i++;
		}
		
	}

}
