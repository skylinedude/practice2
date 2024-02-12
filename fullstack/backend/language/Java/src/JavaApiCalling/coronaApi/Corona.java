package JavaApiCalling.coronaApi;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Corona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myurl="https://data.covid19india.org/data.json";
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
