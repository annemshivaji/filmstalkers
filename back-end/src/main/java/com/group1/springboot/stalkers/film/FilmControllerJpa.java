package com.group1.springboot.stalkers.film;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;





@Controller
@SessionAttributes("name")
public class FilmControllerJpa {
	public FilmControllerJpa(FilmService filmService,FilmRepository filmRepository) {
		super();
		this.filmService = filmService;
		this.filmRepository = filmRepository;
	}

	private FilmService filmService;
	
	private FilmRepository filmRepository;
	
	@RequestMapping("list-films")
	public String listAllfilms(ModelMap model) {
		String username=getLoggedInUsername(model);
		
		List<Film> films = filmRepository.findByUsername(username);
		model.addAttribute("films", films);		
		return "listfilms";
	}
	
	//GET,POST
	@RequestMapping(value="rate",method=RequestMethod.GET)
	public String getrate(ModelMap model) {
		String username = getLoggedInUsername(model);
		Film film = new Film(0, username, "",5);
		model.put("film", film);
		return "rate";
	}
	//@RequestMapping(value="rate",method=RequestMethod.POST)
	//public String postrate(@RequestParam String rating,ModelMap model) {
	//		model.put("rating",rating);
	//		return "titanic";
	//}
	
	@RequestMapping(value="rate",method=RequestMethod.POST)
	public String postrate(ModelMap model,Film film, BindingResult result) {
		
		if(result.hasErrors()) {
			return "film";
		}
		
		String username = getLoggedInUsername(model);
		film.setUsername(username);
		filmRepository.save(film);
//		todoService.addTodo(username, todo.getDescription(), 
//				todo.getTargetDate(), todo.isDone());
		return "redirect:titanic";
	}


	private String getLoggedInUsername(ModelMap model) {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
    
}






	


