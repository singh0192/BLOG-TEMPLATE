package com.rein.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/postPage")
	public String postContentPage(){
		return "postPage";
	}

}
