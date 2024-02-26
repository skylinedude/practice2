package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Program3 {
	int a=30;
	int b=10;
	@GetMapping("api/add")
	public int addition() {
		
		int sum=a+b;
		return sum;
	}
	@GetMapping("api/sub")
	public int sub() {
	int sub=a-b;
	return sub;
	}
	@GetMapping("api/mul")
	public int mutiplication() {
	int mul=a*b;
	return mul;
	}
	@GetMapping("api/div")
	public int division() {
	int div=a/b;
	return div;
	}
	
}
