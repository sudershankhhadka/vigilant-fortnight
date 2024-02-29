package com.bway.SpringCoreDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.SpringCoreDemo.model.User;
@Controller
public class loginController {
	@GetMapping("/login")
	public String getLogin() {
		return "loginForm";
		
	}
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User u,Model model) {
		
		if(u.getUsername().equals("hari") && u.getPassword().equals("123")) {
			model.addAttribute("uname",u.getUsername());
			return "Home";
		}
		
		
		model.addAttribute("message","user not found");
		return "loginForm";
			
	}
}



