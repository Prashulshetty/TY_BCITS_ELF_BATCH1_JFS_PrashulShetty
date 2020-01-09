package filehandling;

import java.io.File;

public class CreateFloder {

	public static void main(String[] args) {
	String path ="D:/FileHandling";
	File file =new File(path); 
	if(file.exists()!=true) {
		file.mkdir();
		System.out.println("folder created...");
	} else {
		System.out.println("folder already exist..");
	}

	}

}
