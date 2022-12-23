package com.group1.springboot.stalkers.film;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Film {
//Database (MySQL) 
//Static List of films => Database (H2, MySQL)

	public Film() {
		
	}
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	//@Id
	private String filmname;
//	private String description;
//	private LocalDate targetDate;
	private double rating;
	
	public Film(int id,String username,String filmname,double rating) {
		super();
		this.id = id;
		this.username = username;
		this.filmname= filmname;
//		this.description = description;
//		this.targetDate = targetDate;
		this.rating = rating;
	}

    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getFilmname() {
		return filmname;
	}

	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}

//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public LocalDate getTargetDate() {
//		return targetDate;
//	}
//
//	public void setTargetDate(LocalDate targetDate) {
//	this.targetDate = targetDate;
//}
	
	public double getrating() {
		return rating;
	}
	
	public void setrating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return filmname +"-"+rating;
	} 

}