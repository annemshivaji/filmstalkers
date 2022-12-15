package com.group1.springboot.stalkers.film;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class FilmService {
		private static List<Film> films = new ArrayList<>();
		static {
			films.add(new Film(1,"Titanic",5d));
			films.add(new Film(2,"Fightclub",4.5d));
			films.add(new Film(3,"GodFather-II",5d));}
		

		public List<Film> findByUsername(String username){
			return films;
		}
		
	}







