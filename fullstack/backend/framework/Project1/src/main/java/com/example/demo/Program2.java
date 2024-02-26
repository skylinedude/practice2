package com.example.demo;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Program2 {

	@GetMapping("api/random")
public int random() {
	Random r=new Random();
	int num=r.nextInt(10)+1;
	return num;
}
}
