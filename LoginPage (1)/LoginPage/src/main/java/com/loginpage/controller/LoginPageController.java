package com.loginpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginpage.pojo.LoginPagePOJO;
import com.loginpage.service.LoginPageService;

@RestController
@RequestMapping(value = "/user")
public class LoginPageController {

	@Autowired
	LoginPageService loginPageService;
	
	@PostMapping(value= {"/login"})
	public LoginPagePOJO userLogin(@RequestBody LoginPagePOJO user)
	{
		return loginPageService.login(user);
	}
	
}
