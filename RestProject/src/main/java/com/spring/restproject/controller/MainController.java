package com.spring.restproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/hello-world")
	public String helloMethod() {
		return "Hello World";
	}

}
