package com.example.demo;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class Program7 {
	@GetMapping("/zzz")
	public String test1(HttpServletResponse response) throws IOException {
return "404";
}
}