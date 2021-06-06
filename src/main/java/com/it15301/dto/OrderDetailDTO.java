package com.it15301.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class OrderDetailDTO {

	private Integer id;
	@NotNull
	@NotBlank
	private Integer quantity;

	@NotNull
	@NotBlank
	private Integer price;
}
