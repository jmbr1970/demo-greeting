package com.example.greeting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("/hi/{name}")
	public String hi(@PathVariable String name){
		return "hello!" + name;
	}
}
