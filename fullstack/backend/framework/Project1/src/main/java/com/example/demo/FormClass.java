package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormClass {
	@PostMapping("forms")
	public String takeAdvance(@RequestParam(defaultValue = "enter") String name,String email,String password,String Date_and_time) {
System.out.println(name + "--" + email + "--" + password + "--" + Date_and_time);
return name + " " + email + " " + password + " " + Date_and_time;
	}
}
