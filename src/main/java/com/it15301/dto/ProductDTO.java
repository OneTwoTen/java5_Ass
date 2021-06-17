package com.it15301.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.it15301.entity.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
	private Integer id;
	
	@NotNull
	@NotBlank
	private String name;
	
//	@NotNull
//	@NotBlank
	private String image;
	
	@NotNull
	private Integer price;
	
//	@NotNull
//	@DateTimeFormat(pattern="dd-MMM-yyyy")
	private Date createDate;
	
	@NotNull
	private Integer avaliable;
	
	@NotNull
	private Category category;
}
