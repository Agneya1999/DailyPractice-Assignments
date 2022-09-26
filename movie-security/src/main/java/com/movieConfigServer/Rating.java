package com.movieConfigServer;



public class Rating {

	private String userId;
	private Integer movieId;
	private double rating;
	public Rating() {
		super();
	}
	public Rating(String userId, Integer movieId, double rating) {
		super();
		this.userId=userId;
		this.movieId = movieId;
		this.rating = rating;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
}
