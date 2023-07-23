package com.loginpage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginpage.pojo.LoginPagePOJO;
import com.loginpage.repository.LoginPageRepository;

@Service
public class LoginPageService {

	@Autowired
	LoginPageRepository loginPageRepository;
	
	public LoginPagePOJO login(LoginPagePOJO user) {
		List<LoginPagePOJO> lst = new ArrayList<LoginPagePOJO>();		
		lst = loginPageRepository.findallUsers(user.getUsername(), user.getPassword());
		LoginPagePOJO userquery = loginPageRepository.findByUserName(user.getUsername());
			if(userquery.getPassword().equals(userquery.getPassword()))
			{
				return userquery;
			}
			if(lst.isEmpty() || lst==null)
			{
				return null;
			}
			else
			{
				return null;
			}
	}
	
	
}
