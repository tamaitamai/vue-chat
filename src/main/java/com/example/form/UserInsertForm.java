package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserInsertForm {
	@Email
	@NotBlank
	private String mail;
	@NotBlank
	private String password;
	@NotBlank
	String lastName;
	@NotBlank
	String firstName;
}
