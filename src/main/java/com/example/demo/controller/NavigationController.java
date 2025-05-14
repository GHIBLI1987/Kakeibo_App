package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
    @GetMapping("/CalculateController")
    // 価格計算
    public String showCalculatePage() {
        return "calculate";
    }

    @GetMapping("/RegisterController")
    // 商品登録
    public String showRegisterPage() {
        return "register";
    }

    @GetMapping("/HistoryController")
    // 履歴確認
    public String showHistoryPage() {
        return "history";
    }
}
