package com.group1.springboot.stalkers.film;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;



@Service
public class FilmService {
		private static List<Film> films = new ArrayList<>();
		static {
			films.add(new Film(1,"shivaji","Titanic",5d));
			films.add(new Film(2,"shivaji","Fightclub",4.5d));
			films.add(new Film(3,"sujatha","GodFather-II",5d));}
		

		
		public List<Film> findByUsername(String username){
		     Predicate<? super Film>predicate = film -> film.getUsername().equalsIgnoreCase(username);
		     return films.stream().filter(predicate).toList();
			}
		
	}







