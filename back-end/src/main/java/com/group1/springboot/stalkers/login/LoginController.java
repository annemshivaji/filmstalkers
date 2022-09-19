package com.group1.springboot.stalkers.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class LoginController {
	       
	 private Logger logger=LoggerFactory.getLogger(getClass());
	
			@RequestMapping("login")
		    public String login(){
		    	return "login";
		    }
			
			
		}




