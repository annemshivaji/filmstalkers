package com.group1.springboot.stalkers.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

	@Controller
	public class helloController {

		
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
		
		
	}


