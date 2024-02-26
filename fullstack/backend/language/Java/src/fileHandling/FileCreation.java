package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean file=new File("C:\\Users\\akons\\Desktop\\Apponix\\practice2\\fullstack\\backend\\language\\Java\\src\\fileHandling/logs").mkdirs();
File file1=new File("C:\\Users\\akons\\Desktop\\Apponix\\practice2\\fullstack\\backend\\language\\Java\\src\\fileHandling\\logs/logins.txt");
	try {
		file1.createNewFile();
		System.out.println("File got created");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
