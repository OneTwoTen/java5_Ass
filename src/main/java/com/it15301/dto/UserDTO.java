package com.it15301.dto;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	private Integer id;
	@NotNull
	@NotBlank
	private String username;

	private String password;

	@NotNull
	@NotBlank
	@Email
	private String email;
//
//	@NotNull
//	@NotBlank
	private String photo;

	@NotNull
	private Integer activated;

	@NotNull
	private Integer admin;
}
