package com.example.demo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Program4 {

    @GetMapping("api/call")
    public String callApi() {
        String myurl = "https://api.bigdatacloud.net/data/reverse-geocode-client";
        var request = HttpRequest.newBuilder().GET().uri(URI.create(myurl)).build();
        var client = HttpClient.newBuilder().build();
        try {
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            return response.body(); 
        } catch (Exception e) {
            e.printStackTrace(); 
            return "Error occurred: " + e.getMessage(); 
        }
    }
}
