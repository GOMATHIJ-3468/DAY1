package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Problem1 {
	
	@GetMapping("welcome")
	public String Welcome() {
		return "Welcome String Boot!";
	}
}
