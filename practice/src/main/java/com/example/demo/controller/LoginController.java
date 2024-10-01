package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LoginController {

	@GetMapping("login")
	public String getLogin() {
		//ビューを指定する
		return "login";
	}
	
	@PostMapping("login")
	public String postLogin( 
			@RequestParam("user") String username,
			@RequestParam("pass") String password,
			Model model ) {
		
		model.addAttribute("name", username );
		model.addAttribute("pass", password );
		
		if(username.equals("admin") && password.equals("pass")) {
			return "top";
			
		} else {
			return "login";
		}
	}
}
