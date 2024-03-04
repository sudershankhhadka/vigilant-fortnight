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
public class loginController {
	
	
	
	@Autowired
	private userRepository  userRepo;
	
	
	@GetMapping("/login")
	public String getLogin() {
		return "loginForm";
		
	}
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User u,Model model) {
		
		User usr = userRepo.findByUsernameAndPassword(u.getUsername(), u.getPassword());
		
		
		if(usr!=null) {
			model.addAttribute("uname",u.getUsername());
			return "Home";
		}
		
		
		model.addAttribute("message","user not found");
		return "loginForm";
			
	}
}



