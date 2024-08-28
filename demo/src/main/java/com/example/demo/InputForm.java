package com.example.demo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


public class InputForm{
	
	@NotBlank
	private String syain;
	
	
	@NotNull
	private String age;
	
	
	@NotBlank
	@Pattern(regexp="[a-zA-Z0-9]{8,}")
	private String pass;
	
}