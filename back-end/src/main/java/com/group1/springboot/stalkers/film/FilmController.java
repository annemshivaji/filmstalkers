package com.group1.springboot.stalkers.film;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("name")
public class FilmController {
	public FilmController(FilmService filmService) {
		super();
		this.filmService = filmService;
	}

	private FilmService filmService;
		
	
	@RequestMapping("list-films")
	public String listAllfilms(ModelMap model) {
		List<Film> films = filmService.findByUsername("Titanic");
		model.addAttribute("films", films);		
		return "listfilms";
	}
    
}






	


