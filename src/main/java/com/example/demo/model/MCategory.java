package com.example.demo.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MCategory {
	
	private Integer categoryId;
	private String categoryName;
	private Integer parentId;
	private boolean delFlg;
}