package com.bway.SpringCoreDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class galleryController {
	@GetMapping("/gallery")
	public String gallery() {
		return "gallery";
	}
}
