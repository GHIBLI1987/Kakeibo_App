package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.MCategory;
import com.example.demo.model.service.CalculateService;

@Controller
public class CalculateController {
	@Autowired
	private CalculateService service;
	private Model local_model;
	
	
	@GetMapping("/calculate")
	public String execute(Model model) {
		
		// 値の初期化
		model.addAttribute("gram", 1);
		// 大分類のプルダウン値取得
		List<MCategory> bigDirectionList = service.getBigDirectionList();
		model.addAttribute("bigDirectionList", bigDirectionList);
		// 小分類のプルダウン値取得
		List<MCategory> littleDirectionList = service.getLittleDirectionList("");
		model.addAttribute("littleDirectionList", littleDirectionList);
		local_model=model;
        return "calculate"; // calculate.htmlを表示
    }
	
	@PostMapping("/calculate/changeBigDirection")
    public String changeBigDirection(@ModelAttribute("littleDirectionList") String bigDirection) {
		// 小分類のプルダウン値取得
		List<MCategory> littleDirectionList = service.getLittleDirectionList(bigDirection);
        return "calculate"; // calculate.htmlを表示
    }
}
