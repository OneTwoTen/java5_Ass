package com.it15301.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CategoryDTO {

	private Integer id;

	@NotNull
	@NotBlank
	private String name;
}
