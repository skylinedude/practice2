package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WritingIntoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {	
	var mydate=new Date();
	var wr=new FileWriter("C:\\Users\\akons\\Desktop\\Apponix\\practice2\\fullstack\\backend\\language\\Java\\src\\fileHandling\\logs/logins.txt");
	wr.write("Client Name: 'Manoj' \nLogin Date and Time: "+mydate);
	System.out.println("writing into a file completed");
	wr.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
