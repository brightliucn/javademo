package com.bright.demo.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bright.demo.domain.User;
import com.bright.demo.domain.UserMapper;

@RestController
public class WebController {

	@Autowired
	private UserMapper usermapper;
	
	@RequestMapping(value = "/one")
	public User getByName() {
		return usermapper.getByName("Tom");
	}
	
	@RequestMapping(value = "/all")
	public List<User> getAll(){
		return usermapper.getAll();
	}
}
