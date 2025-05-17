package com.example.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EditUserForm {
	private Integer id;
	@Email
	@NotBlank
	private String mail;
	@NotBlank
	String lastName;
	@NotBlank
	String firstName;
}
