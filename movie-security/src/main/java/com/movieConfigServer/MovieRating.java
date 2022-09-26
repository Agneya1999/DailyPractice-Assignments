package com.movieConfigServer;

import java.util.List;



public class MovieRating {

	private List<Rating> userRating;
	

	public MovieRating() {
		super();
	}
	public MovieRating(List<Rating> userRating) {
		super();
		this.userRating = userRating;
	}

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}
	
	
	
	
}
