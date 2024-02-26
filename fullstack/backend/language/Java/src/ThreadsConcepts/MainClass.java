package ThreadsConcepts;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello1");
System.out.println("Hello2");
//Dosome ds=new Dosome("Thread-1");
//ds.start();
	}
 void show() {
	for(int i=0;i<10;i++) {
		System.out.println(i);
		String myurl="https://api.bigdatacloud.net/data/reverse-geocode-client";
		var request=HttpRequest.newBuilder().GET().uri(URI.create(myurl)).build();
			var client=HttpClient.newBuilder().build();
			System.out.println(client);
			try {
				var response=client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());
			}catch(Exception e) {
				System.out.println(e);
	}
	}
}
	

}
class Dosome implements Runnable{
String threadname;
Thread t;
Dosome(String name){
	threadname=name;
	System.out.println(name);
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String myurl="https://api.bigdatacloud.net/data/reverse-geocode-client";
		var request=HttpRequest.newBuilder().GET().uri(URI.create(myurl)).build();
			var client=HttpClient.newBuilder().build();
			System.out.println(client);
			try {
				var response=client.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());
			}catch(Exception e) {
				System.out.println(e);
	}
	
}
	void start() {
		if(t==null) {
			t=new Thread(this,threadname);
			t.start();
			}
	}
}