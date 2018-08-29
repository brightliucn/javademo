package com.bright.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bright.demo.domain.User;

@Controller
public class WebController {

	@RequestMapping(value = "")
	String index(Model model) {
		return "index";
	}
	
	@RequestMapping(value = "test1")
	String test1(Model model) {
		model.addAttribute("msg", "hello");
		return "test1";
	}
	
	@RequestMapping(value = "test2")
	String test2(Model model) {
		User user= new User();
		user.setId("1111");
		user.setName("Tom");
		model.addAttribute("user", user);
		return "test2";
	}
}


