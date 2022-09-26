package com.movieCatalog;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	RestTemplate restTemplate;
	
//	@Autowired
//	private MovieRatingProxy movieratingProxy;
	
//	@GetMapping("/moviecatalog/{movieId}")
//	public CatalogItem getMovieBasedOnMovieId(@PathVariable Integer movieId) {
//		HashMap<String, Integer> urivariables=new HashMap<String, Integer>();
//		urivariables.put("movieId", movieId);
//		ResponseEntity<MovieRating> responseentity = new RestTemplate().getForEntity("http://localhost:8083/movierating/{movieId}", MovieRating.class,urivariables);
//		MovieRating mr= responseentity.getBody();
//		return new CatalogItem("KGF", "gangster", mr.getRating());
//	}
	
//	@GetMapping("/hey")
//	public CatalogItem hey() {
//		CatalogItem ca= movieratingProxy.get();
//		return new CatalogItem("KGF",ca.getMovieId(), "Crime", ca.getRating());
//	}
	
//	@GetMapping("/{userId}")
//	public List<CatalogItem> getCatalogItem(@PathVariable String userId){
//		//return Collections.singletonList(new CatalogItem("Spiderman","Animated movie",4));
//		MovieRating userRating = restTemplate.getForObject("http://movierating/ratingsdata/users/"+ userId, MovieRating.class);
//		return userRating.getUserRating().stream().map(rating -> {
//			
//			ResponseEntity<Movie> responseEntity =  restTemplate.getForEntity("http://movieservice/movies/movie/"+rating.getMovieId(), Movie.class);
//		
//			Movie movie = responseEntity.getBody();
//			return new CatalogItem(movie.getMovieName(), "Transformers Description", rating.getRating());
//		
//		}).collect(Collectors.toList());
//		
//		
//	}
	//fetching the list of rating given by a user based on the userId
	@GetMapping("/{userId}")
	public List<Rating> getAllMoviesOfUser(@PathVariable String userId){
		List<Rating> rating=restTemplate.getForObject("http://movierating/ratingsdata/userrating/"+ userId, List.class);
		return rating;
	}
	
	@GetMapping("/movieName/{movieName}")
	public List<Rating> getAllUsersByMoviename(@PathVariable String movieName){
		Movie movie=restTemplate.getForObject("http://movieservice/movies/movieName/"+ movieName, Movie.class);
		List<Rating> rating=restTemplate.getForObject("http://movierating/ratingsdata/movierating/"+ movie.getMovieId(), List.class);
		return rating;
	}
	
	//get average rating by providing movie name
	@GetMapping("/movieName/averageRating/{movieName}")
	public Double getAverageRatingByMoviename(@PathVariable String movieName){
		Movie movie=restTemplate.getForObject("http://movieservice/movies/movieName/"+ movieName, Movie.class);
		Double message=restTemplate.getForObject("http://movierating/ratingsdata/averagerating/"+ movie.getMovieId(), Double.class);
//		String msg= movie.getMovieName()+message+"/10";
		return message;
	}
	
		
}

