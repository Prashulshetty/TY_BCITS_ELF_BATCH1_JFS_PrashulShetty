package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		String path="D:/FileHandling/sample.txt";
		File file =new File(path);
		if(file.exists()!= true) {
			try {
				file.createNewFile();
				System.out.println("file created...");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("file already exist....");
		}
		

	}

}
