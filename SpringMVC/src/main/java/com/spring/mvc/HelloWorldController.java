package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/showForm2")
	public String showForm2() {
		return "helloworld-form2";
	}
	
	@RequestMapping("/processForm2")
	public String processForm2(HttpServletRequest httpServletRequest, Model model) {
		
		String theName = httpServletRequest.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "Yo! " + theName;
		
		model.addAttribute("message", result);
		
		return "helloworld2";
	}
	
	@RequestMapping("/processForm3")
	public String processForm3(@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		
		String result = "Yo yo! " + theName;
		
		model.addAttribute("message", result);
		
		return "helloworld2";
	}
}
