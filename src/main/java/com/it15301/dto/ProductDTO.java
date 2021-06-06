package com.it15301.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class ProductDTO {
	private Integer id;
	
	@NotNull
	@NotBlank
	private String name;
	
	@NotNull
	@NotBlank
	private String image;
	
	@NotNull
	@NotEmpty
	private Integer price;
	
	@NotNull
	@DateTimeFormat(pattern="dd-MMM-yyyy")
	private Date createDate;
	
	@NotNull
	@NotEmpty
	private Integer available;
}
