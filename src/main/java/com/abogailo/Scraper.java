package com.abogailo;


class Scraper {
	//POJO 
	
	private Integer movie_id;
	private String movie_title;
	private Integer movie_rank;
	private Integer movie_release;
	private Integer movie_rating;
	
	//Constructor
	 public Scraper(Integer movie_id, String movie_title, Integer movie_rank, Integer movie_release, Integer movie_rating) {
	        this.movie_id = movie_id;
	        this.movie_title = movie_title;
	        this.movie_rank = movie_rank;
	        this.movie_release = movie_release;
	        this.movie_rating = movie_rating;
	    }
	
	 //getters and setters
	public Integer getRank() {
		return movie_rank;
	}
	public void setRank(Integer movie_rank) {
		this.movie_rank = movie_rank;
	}
	
	public Integer getId() {
		return movie_id;
	}
	public void setId(Integer movie_id) {
		this.movie_id = movie_id;
	}
	
	public String getTitle() {
		return movie_title;
	}
	public void setTitle(String movie_title) {
		this.movie_title = movie_title;
	}
	
	public Integer getReleaseYear() {
		return movie_release;
	}
	public void setReleaseYear(Integer movie_release) {
		this.movie_release = movie_release;
	}
	
	public Integer getRating() {
		return movie_rating;
	}
	public void setRating(Integer movie_rating) {
		this.movie_rating = movie_rating;
	}
} 