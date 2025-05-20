package com.example.demo.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.MCategory;
import com.example.demo.model.repository.CategoryMapper;

@Service
public class CalculateService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<MCategory> getBigDirectionList() {
		List<MCategory> bigDirectionList = jdbcTemplate.queryForObject("select * from price_db.M_Category where parent_id is Null", new CategoryMapper());
		
		return bigDirectionList;
	}
	public List<MCategory> getLittleDirectionList(String bigDirection) {
		List<MCategory> littleDirectionList = null;
		if(!bigDirection.isBlank()) {
			littleDirectionList = jdbcTemplate.queryForObject("select * from price_db.M_Category where parent_id ="+bigDirection, new CategoryMapper());
		}
		
		
		return littleDirectionList;
	}

}
