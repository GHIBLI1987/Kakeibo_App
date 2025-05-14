package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistoryController {
	@GetMapping("/history")
	
    public String showHistory() {
        return "history"; // history.htmlを表示
    }
}
