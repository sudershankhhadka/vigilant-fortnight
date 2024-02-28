package com.bway.SpringCoreDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class aboutController {
	@GetMapping("/about")
	public String aboutcontroller() {
		return "about";
	}
}
