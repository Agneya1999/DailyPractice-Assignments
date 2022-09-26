package com.movieRating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class MovieRatingController {

	@Autowired
	private MovieRatingService ratingService;
	
//	@GetMapping("/movierating/{userId}")
//	public Rating movieRating(@PathVariable Integer movieId) {
//		return ratingService.getRatingById(movieId);
//	}
	
	//fetching the movie rating based on movieId
	@GetMapping("/movierating/{movieId}")
	public List<Rating> movieRating(@PathVariable Integer movieId) {
		return ratingService.getRatingOfMovie(movieId);
	}
	
	//fetching the movie rating based on userId
	@GetMapping("/userrating/{userId}")
	public List<Rating> movieRating(@PathVariable String userId) {
		return ratingService.getMovieRatingProvidedByUser(userId);
	}
	
	//fetching the average rating of a movie
	@GetMapping("/averagerating/{movieId}")
    public String getAverageRating(@PathVariable Integer movieId) {
        double avgRating=0;
        List<Rating> ratingList = new ArrayList();
        ratingList= ratingService.getRatingOfMovie(movieId);
        Iterator<Rating> iterator= ratingList.iterator();
        while(iterator.hasNext()) {
            avgRating=avgRating+ iterator.next().getRating();
        }
        avgRating=(double)(avgRating/ratingList.size());
        return "  movie Average Rating is - "+avgRating;
    }
	
	@PostMapping("/movierating/add")
	public Integer addMovieRating(@RequestBody Rating rating) {
		Integer a= ratingService.addRating(rating);
		return a;
	}
	
//	@PutMapping(value="/movierating/update")
//	public String update(@RequestBody Rating rating,Integer movieId) {
//		Integer a=ratingService.updateMovieRating(rating, movieId);
//		return "Updated row from the database book having bookID = "+a;
//	}
//	
//	@DeleteMapping(value="/movierating/delete/{movieId}")
//	public String delete(@PathVariable Integer movieId) {
//		Integer a=ratingService.delete(movieId);
//		return "Deleted row from the database book having bookID = "+a;
//	}
//	
//	@GetMapping("{movieId}")
//	public Rating getRating(@PathVariable Integer movieId) {
//		return new Rating(movieId, 4);
//	}
//	
//	@GetMapping("/users/{userId}")
//	public MovieRating getUserRating(@PathVariable String userId) {
//		List<Rating> ratings = Arrays.asList(new Rating(101,4),new Rating(102,6));
//		System.out.println(ratings);
//		MovieRating movierating=new MovieRating();
//		movierating.setUserRating(ratings);
//		return movierating;
//	}
}
