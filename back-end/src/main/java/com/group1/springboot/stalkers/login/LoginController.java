package com.group1.springboot.stalkers.login;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.group1.springboot.stalkers.film.Film;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	private AuthenticationService authenticationService;
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
    
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String gotoLoginPage(ModelMap model) {
		model.put("name","shivaji");
		return "login";
	}

	@RequestMapping(value="login",method = RequestMethod.POST)
	

	//login?name=Ranga RequestParam
	public String gotoWelcomePage(@RequestParam String name, 
			@RequestParam String password, ModelMap model) {
		
		if(authenticationService.authenticate(name, password)) {
			model.put("name", name);
			//Authentication 
			//name - shivaji
			//password - 8		
			return "home";
		}		
		return "login";
	}
}

