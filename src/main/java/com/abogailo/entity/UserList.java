package com.abogailo.entity;

public class UserList {
	// POJO

	private Integer list_num;
	private Integer person_id;
	private Integer movie_id;
	private Integer movie_rating;
	private Integer personal_rank;

	// Constructor
	public UserList(Integer list_num, Integer person_id, Integer movie_id, Integer movie_rating,
			Integer personal_rank) {
		this.list_num = list_num;
		this.person_id = person_id;
		this.movie_id = movie_id;
		this.movie_rating = movie_rating;
		this.personal_rank = personal_rank;
	}

	// getters and setters
	public Integer getList_num() {
		return list_num;
	}

	public void setList_num(Integer list_num) {
		this.list_num = list_num;
	}

	public Integer getPerson_id() {
		return person_id;
	}

	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}

	public Integer getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}

	public Integer getMovie_rating() {
		return movie_rating;
	}

	public void setMovie_rating(Integer movie_rating) {
		this.movie_rating = movie_rating;
	}

	public Integer getPersonal_rank() {
		return personal_rank;
	}

	public void setPersonal_rank(Integer personal_rank) {
		this.personal_rank = personal_rank;
	}
}