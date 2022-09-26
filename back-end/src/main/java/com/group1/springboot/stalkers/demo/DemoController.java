package com.group1.springboot.stalkers.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
		@RequestMapping("bye")
		@ResponseBody
			
		public int SayHell(){
		    int a=1;
		    return ++a;
		    }			
}