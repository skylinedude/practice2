package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Program5 {
	@PostMapping("/api/take")
	public String takeAdvance(@RequestParam(defaultValue="ggg") String name,String email1,String password) {
		System.out.println(name+"--"+email1+"--"+password);
		var data=name+"--"+email1+"--"+password;
		return data;
	}

}
