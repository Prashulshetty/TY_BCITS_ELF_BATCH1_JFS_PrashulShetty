package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.sound.midi.Soundbank;

public class ConcatData {

	public static void main(String[] args) {
		String path1 = "D:/FileHandling/sample2.txt";
		String path2 = "D:/FileHandling/sample3.txt";
		String path3 = "D:/FileHandling/sample.txt";
		File file1 = new File(path1);
		File file2 = new File(path2);
		File file3 = new File(path3);
		if(file1.exists() && file2.exists() && file3.exists() ==true) {
			try { 
				FileReader fr1=new FileReader(file1);
				int length1 = (int) file1.length();
				char[] c1 = new char[length1];
				fr1.read(c1);
				FileReader fr2=new FileReader(file2);
				int length2 = (int) file1.length();
				char[] c2 = new char[length2];
				fr2.read(c2);
				System.out.print(c1);
				System.out.print(" ");
                System.out.println(c2);	
                FileWriter fw = new FileWriter(file3);
                fw.write(c1);
                fw.write(c2);
                fw.flush();
                System.out.println("Writting data to file is completed...");
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
 }
}
