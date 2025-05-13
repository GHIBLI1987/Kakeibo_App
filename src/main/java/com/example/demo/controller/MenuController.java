package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
	@GetMapping("/")
	// URL:http://localhost:8080/
    public String showMenu() {
        return "menu"; // menu.htmlを表示
    }
}
