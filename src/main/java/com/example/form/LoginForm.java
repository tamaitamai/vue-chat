package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginForm {
	@Email
	@NotBlank
	private String mail;
	@NotBlank
	private String password;
}
