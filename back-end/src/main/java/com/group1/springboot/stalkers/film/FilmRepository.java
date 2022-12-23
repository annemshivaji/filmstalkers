package com.group1.springboot.stalkers.film;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer>{
     
	  public List<Film> findByUsername(String username);
}
