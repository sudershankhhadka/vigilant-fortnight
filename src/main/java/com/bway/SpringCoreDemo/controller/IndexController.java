package com.bway.SpringCoreDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller    //used to control http request
public class IndexController {
	
	@GetMapping("/")    // "/ " is used to start at first 
	public String getIndex() {
		return "index";    // index here is the name of the html file
	}
}
