package com.movieConfigServer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@CrossOrigin(origins="http://127.0.0.1:5500", allowedHeaders = "*",allowCredentials = "true")
@RequestMapping("/moviesecurity")
public class MovieSecurityController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/userid/{userId}")
	public List<Rating> getAllMoviesOfUser(@PathVariable String userId){
		List<Rating> rating=restTemplate.getForObject("http://moviecombine/catalog/"+ userId, List.class);
		return rating;
	}
	
	@GetMapping("/moviename/{movieName}")
	public List<Rating> getAllMoviesByMovieName(@PathVariable String movieName){
		List<Rating> rating=restTemplate.getForObject("http://moviecombine/catalog/movieName/"+ movieName, List.class);
		return rating;
	}
	
	@GetMapping("/getAllMovies")
	public List<Movie> getAllMovies(){
		List<Movie> movie=restTemplate.getForObject("http://movieservice/movies/getall", List.class);
		return movie;
	}
	
	@GetMapping("/moviename/averagerating/{movieName}")
	public double getAverageratingOfMovie(@PathVariable String movieName){
		double message=restTemplate.getForObject("http://moviecombine/catalog/movieName/averageRating/"+ movieName, double.class);
		return message;
	}
	
}
