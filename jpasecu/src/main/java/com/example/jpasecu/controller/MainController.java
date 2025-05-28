package com.example.jpasecu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MainController {

	@GetMapping("/")
	public String root(Model model) {
		log.trace("root....trace");
		log.debug("root....debug");
		log.warn("root.....warn");
		log.error("root.....error");
		
		String root = "root";
		log.info("{}.....info", root);
		
		model.addAttribute("greet", "Hello~~");
		return "index";
	}
}
