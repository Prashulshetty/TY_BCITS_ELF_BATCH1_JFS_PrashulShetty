package com.bcits.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		String path1 ="D:\\bcits\\msg1.txt";
		String path2 ="D:\\bcits\\msg2.txt";
		File f1 =new File(path1);
		File f2 = new File(path2);
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the text to write : ");
			FileWriter fw =new FileWriter(f1);
			fw.write(s.nextLine());
			fw.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			FileReader fr =new FileReader(f1);
			FileWriter fw1 = new FileWriter(f2);
			int len = (int) f1.length();
			char[] ch =new char[len];
			fr.read(ch);
			fw1.write(ch);
			fw1.flush();
			System.out.println("file writing is complete");
		} catch (IOException e) {
			System.out.println("file not found");
		}

	}

}
