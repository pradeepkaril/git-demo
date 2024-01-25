package com.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@GetMapping("/1api")
	@ResponseBody
	public String HealthCheck1() {
		return "All are ok 1";
	}
	
	@GetMapping("/2api")
	@ResponseBody
	public String HealthCheck2() {
		return "All are ok 2";
	}
}
