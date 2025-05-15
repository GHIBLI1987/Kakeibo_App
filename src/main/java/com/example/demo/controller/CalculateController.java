package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculateController {
	@GetMapping("/calculate")
	
    public String execute() {
		// 値の初期化
		// 大分類のプルダウン値取得
		// 小分類のプルダウン値取得
        return "calculate"; // calculate.htmlを表示
    }
}
