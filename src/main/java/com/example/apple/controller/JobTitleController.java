package com.example.apple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class JobTitleController {
	@GetMapping("/jobtitle")
	public String getCountries() {
		return "JobTitle";
	}

}
