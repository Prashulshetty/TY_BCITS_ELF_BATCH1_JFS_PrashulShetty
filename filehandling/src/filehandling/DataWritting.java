package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataWritting {

	public static void main(String[] args) {
		String path = "D:/FileHandling/sample2.txt";
		File file = new File(path);
		if (file.exists() == true) {
			try {
				FileWriter fw = new FileWriter(file);
				fw.write("Hi Hello Welcome");
				fw.flush();
				System.out.println("file writting complete...");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("file writting is not completed..");
		}
	}
}
