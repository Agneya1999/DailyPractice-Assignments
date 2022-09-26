package com.movieConfigServer;

public class Movie {

	private Integer movieId;
	private String movieName;

	public Movie() {
		super();
	}

	public Movie(Integer movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}
	
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	
}
