package com.bway.SpringCoreDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.SpringCoreDemo.model.User;
import com.bway.SpringCoreDemo.repository.userRepository;
@Controller
public class signupController {
	@Autowired
	private userRepository userRepo;
	@GetMapping("/signup")
	public String signup() {
		return "signUp";
	}
	
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User u,Model model ) {
//		model.addAttribute("fname",u.getFname());
//		model.addAttribute("lname" ,u.getLname());
//		model.addAttribute("username",u.getUsername());
//		model.addAttribute("email",u.getEmail());
//		model.addAttribute("password",u.getPassword());
		
		
		model.addAttribute("user",u);   //shorthand step for above metioned steps
		u.save("user");
		return "loginForm";
		
	}
}
