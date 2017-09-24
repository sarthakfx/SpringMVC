package com.sarthak.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TheController {

	@RequestMapping(value="hello")
	public String Hello(){
		System.out.println("run");
		return "pages/hello";
	}
	
	@RequestMapping(value="click")
	public String Click(){
		System.out.println("run2");
		return "pages/link";
	}
}
