package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.MCategory;
import com.example.demo.model.repository.CategoryMapper;
import com.example.demo.model.service.CalculateService;

@Controller
public class CalculateController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private CalculateService service;
	
	
	@GetMapping("/calculate")
	public String execute(Model model) {
		
		// 値の初期化
		model.addAttribute("gram", 1);
		// 大分類のプルダウン値取得
		List<MCategory> bigDirectionList = jdbcTemplate.queryForObject("select * from price_db.M_Category where parent_id is Null", new CategoryMapper());
		model.addAttribute("bigDirectionList", bigDirectionList);
		// 小分類のプルダウン値取得
		List<MCategory> littleDirectionList = null;
		model.addAttribute("littleDirectionList", littleDirectionList);
        return "calculate"; // calculate.htmlを表示
    }
}
