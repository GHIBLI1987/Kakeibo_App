package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {
	@GetMapping("/register")
	
    public String showRegister() {
        return "register"; // register.htmlを表示
    }
}
