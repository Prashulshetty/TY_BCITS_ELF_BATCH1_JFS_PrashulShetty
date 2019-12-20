package com.bcits.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileRead2 {

	public static void main(String[] args) {
		String path1 ="D:\\bcits\\msg1.txt";
		String path2 ="D:\\bcits\\msg2.txt";
		String path3 ="D:\\bcits\\msg3.txt";
		File f1 =new File(path1);
		File f2 = new File(path2);
		File f3 = new File(path3);
		try {
			FileReader fr1 = new FileReader(f1);
			FileReader fr2 = new FileReader(f2);
			FileWriter fw =new FileWriter(f3);

			int len1 = (int) f1.length();
			char[] ch1 =new char[len1];
			fr1.read(ch1);
			
			int len2 = (int) f2.length();
			char[] ch2 =new char[len2];
			fr1.read(ch2);
			
			fw.write(ch1);
			fw.write(ch2);
			fw.flush();
			
			System.out.println("file writing is complete");
		} catch (IOException e) {
			System.out.println("file not found");
		}

	}

}
