package com.kgisl.sbkeycloak.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @GetMapping("/hellouser")
	public String helloUser()
	{
		
		return "hellouser";
	}
	
	@GetMapping("/helloadmin")
	public String helloAdmin()
	{
		
		return "helloadmin";
	} 
}
