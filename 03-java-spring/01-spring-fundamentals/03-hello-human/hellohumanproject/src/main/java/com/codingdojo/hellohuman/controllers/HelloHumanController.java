package com.codingdojo.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloHumanController {
	@RequestMapping("/")
	public String showName(@RequestParam(value = "name", required = false) String firstName,
			@RequestParam(value = "lastName", required = false) String lastName,
			@RequestParam(value = "times", required = false) String times) {

		String myString = "";
		if (firstName == null && lastName == null && times == null) {
			return "Hello human";
		} 
		if (times == null && firstName != null && lastName != null) {

			return "Hello " + firstName + " " + lastName;
		}

		if (lastName == null && times != null && firstName != null) {

			for (int i = 0; i < Integer.parseInt(times); i++) {
				
				myString += "Hello " + firstName + " ";
			}

		}

		return myString;
	}
}
