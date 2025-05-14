package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculateController {
	@GetMapping("/calculate")
	
    public String showCalculate() {
        return "calculate"; // calculate.htmlを表示
    }
}
