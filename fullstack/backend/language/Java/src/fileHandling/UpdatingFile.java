package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;

public class UpdatingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename=("C:\\Users\\akons\\Desktop\\Apponix\\practice2\\fullstack\\backend\\language\\Java\\src\\fileHandling\\logs/logins.txt");
try {
	
	FileWriter wr=new FileWriter(filename,true);
	InetAddress Ip=InetAddress.getLocalHost();
	wr.append("\nClient IP Address: "+Ip.getHostAddress());
	System.out.println("File Updated");
	wr.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
