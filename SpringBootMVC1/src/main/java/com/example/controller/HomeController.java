package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


	@RequestMapping("/")
	public String home() {
		return "home";
	}
	 @RequestMapping("/home/{name}/{tech}")
	 public ModelAndView hello(@PathVariable("name") String name,@PathVariable("tech")String tech) {
		 System.out.println("hello"+name+",glad to work in"+tech);
		 String model ="Hello"+name+",glad to work in "+tech;
		 ModelAndView modelAndView=new ModelAndView("hello");
		 modelAndView.addObject("hello",model);
		 return modelAndView;
	 }
	  
	}


