package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataReading {

	public static void main(String[] args) {
	String path = "D:/FileHandling/sample3.txt";
	File file = new File(path);
	if(file.exists()==true) {
		try {
			FileReader fr=new FileReader(file);
			int length = (int) file.length();
			char[] c = new char[length];
			fr.read(c);
			System.out.println(c);
			System.out.println("Reading data from file is successful..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} else {
		System.out.println("Reading data from file is not successful..");
	}
	

	}

}
