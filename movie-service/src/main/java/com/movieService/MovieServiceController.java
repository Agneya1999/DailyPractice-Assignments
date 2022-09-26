package com.movieService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movies")
public class MovieServiceController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movieName/{movieName}")
	public Movie movieRating(@PathVariable String movieName) {
		return movieService.getMovieId(movieName);
	}
	
	@GetMapping("/{movieId}")
	public Movie movieRating(@PathVariable Integer movieId) {
		return movieService.getMovieById(movieId);
	}
	
	
	@GetMapping("/getall")
	public List<Movie> movieRating() {
		return movieService.getAllMovie();
	}
	
	@PostMapping("/add")
	public Integer addMovie(@RequestBody Movie movie) {
		Integer a= movieService.addRating(movie);
		return a;
	}
//	 @RequestMapping("/{movieId}")
//	    public Movie getMovieInfo(@PathVariable Integer movieId) {
//	        return new Movie(movieId,"Transformaers"+movieId);
//	    }
}
