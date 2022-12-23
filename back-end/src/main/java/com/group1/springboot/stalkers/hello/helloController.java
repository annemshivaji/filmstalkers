package com.group1.springboot.stalkers.hello;


import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.group1.springboot.stalkers.film.Film;

	@Controller
	public class helloController {

		
		@RequestMapping("index")
//		@ResponseBody (no response body for view)
		
	    public String index(){
	    	return "index";
	    }
		

		
//		//GET,POST
//		@RequestMapping(value="rate",method=RequestMethod.GET)
//		public String getrate() {
//			return "rate";
//		}
//		//@RequestMapping(value="rate",method=RequestMethod.POST)
//		//public String postrate(@RequestParam String rating,ModelMap model) {
//		//		model.put("rating",rating);
//		//		return "titanic";
//		//}
//		
//		@RequestMapping(value="rate",method=RequestMethod.POST)
//		public String postrate(ModelMap model, @Valid Film film, BindingResult result) {
//			
//			if(result.hasErrors()) {
//				return "todo";
//			}
//			
//			String username = getLoggedInUsername(model);
//			film.setUsername(username);
//			filmRepository.save(film);
////			todoService.addTodo(username, todo.getDescription(), 
////					todo.getTargetDate(), todo.isDone());
//			return "redirect:list-films";
//		}
		

		
	}


