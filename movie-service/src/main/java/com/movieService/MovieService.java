package com.movieService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieService {

	@Autowired
	private MovieServiceRepo movieServiceRepo;
	
	public Movie getMovieById(Integer movieId) {
	Optional<Movie> optional= movieServiceRepo.findById(movieId);
	System.out.println(optional);
	return optional.get();
	}
	
	public List<Movie> getAllMovie(){
		List<Movie> movie = new ArrayList<>();
		movieServiceRepo.findAll().forEach(movie::add);
		return movie;
	}
	
	public Integer addRating(Movie movie) {
		movieServiceRepo.save(movie);
		return movie.getMovieId();
		}
	
    public Movie getMovieId(String movieName) {
    	return movieServiceRepo.findByMovieName(movieName);
    }
}
