package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Program1 {
@GetMapping("api/takestring")
	public String takestring() {
	return "Skyline";
}
}
