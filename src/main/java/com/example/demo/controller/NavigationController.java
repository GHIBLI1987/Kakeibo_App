package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
    @GetMapping("/calculate")
    // 価格計算
    public String showCalculatePage() {
        return "calculate";
    }

    @GetMapping("/register")
    // 商品登録
    public String showRegisterPage() {
        return "register";
    }

    @GetMapping("/history")
    // 履歴確認
    public String showHistoryPage() {
        return "history";
    }
}
