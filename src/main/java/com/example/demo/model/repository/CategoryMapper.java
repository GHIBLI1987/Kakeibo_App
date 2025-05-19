package com.example.demo.model.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.MCategory;

public class CategoryMapper implements RowMapper<List<MCategory>> {
	public List<MCategory> mapRow(ResultSet rs, int rowNum)
			throws SQLException {
				List<MCategory> list = new ArrayList<>();
				MCategory temp_category = new MCategory();
				temp_category.setCategoryId(rs.getInt("CATEGORY_ID"));
				temp_category.setCategoryName(rs.getString("CATEGORY_NAME"));
				list.add(temp_category);
				while (rs.next()) {
					MCategory categoery = new MCategory();
					categoery.setCategoryId(rs.getInt("CATEGORY_ID"));
					categoery.setCategoryName(rs.getString("CATEGORY_NAME"));
					list.add(categoery);
				}
				return list;
			}
}
