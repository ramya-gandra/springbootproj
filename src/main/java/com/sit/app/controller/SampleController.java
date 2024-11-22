package com.sit.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Hello")
public class SampleController {
	
	@GetMapping
	public  String test(HttpServletRequest request) {
		
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		return  "Hello" + uname + "R123" +pwd+  "Welcome to Spring Framework!";
	}

}
