package com.group1.springboot.stalkers.film;



public class Film {
//Database (MySQL) 
//Static List of films => Database (H2, MySQL)

	

	private int id;
	private String username;
//	private String description;
//	private LocalDate targetDate;
	private double rating;
	
	public Film(int id,String username,double rating) {
		super();
		this.id = id;
		this.username = username;
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
//		this.targetDate = targetDate;
//	}
	
	public double getrating() {
		return rating;
	}
	
	public void setrating(double rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return username +"-"+rating;
	} 

}