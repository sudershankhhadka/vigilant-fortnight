package com.bway.SpringCoreDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class signupController {
	@GetMapping("/signup")
	public String signup() {
		return "signUp";
	}
}
