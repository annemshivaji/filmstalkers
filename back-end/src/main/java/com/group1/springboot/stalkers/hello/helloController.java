package com.group1.springboot.stalkers.hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		
		//GET,POST
		@RequestMapping(value="rate",method=RequestMethod.GET)
		public String getrate() {
			return "rate";
		}
		
		@RequestMapping(value="rate",method=RequestMethod.POST)
	
		//login?name=Ranga RequestParam
		public String postrate(@RequestParam String rating,ModelMap model) {

				model.put("rating",rating);
				//Authentication 
				//name - shivaji
				//password - 8		
				return "titanic";
		

		}
		
		
	}


