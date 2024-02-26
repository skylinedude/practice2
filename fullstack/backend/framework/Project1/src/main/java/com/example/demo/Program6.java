package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Program6 {
		@RequestMapping("/abc1")
		public String notFound() {
			return "notfound";
		}
}
