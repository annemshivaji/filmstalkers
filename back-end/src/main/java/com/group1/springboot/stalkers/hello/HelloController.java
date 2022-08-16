package com.group1.springboot.stalkers.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

	@Controller
	public class HelloController {
		@RequestMapping("hello")
		@ResponseBody
		
	    public int SayHello(){
			int a=1;
	    	return ++a;
	    }
		
		@RequestMapping("index")
//		@ResponseBody (no response body for view)
		
	    public String index(){
	    	return "index";
	    }
		
		@RequestMapping("titanic")
//		@ResponseBody (no response body for view)
		
	    public String titanic(){
	    	return "titanic";
	    }
		
		@RequestMapping("login")
	    public String login(){
	    	return "login";
	    }
		
		
	}


