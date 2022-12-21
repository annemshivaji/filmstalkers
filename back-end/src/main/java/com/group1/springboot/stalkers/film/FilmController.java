package com.group1.springboot.stalkers.film;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;



//@Controller
@SessionAttributes("name")
public class FilmController {
	public FilmController(FilmService filmService) {
		super();
		this.filmService = filmService;
	}

	private FilmService filmService;
		
	
	@RequestMapping("list-films")
	public String listAllfilms(ModelMap model) {
		String username=getLoggedInUsername(model);
		List<Film> films = filmService.findByUsername(username);
		model.addAttribute("films", films);		
		return "listfilms";
	}


	private String getLoggedInUsername(ModelMap model) {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
    
}






	


