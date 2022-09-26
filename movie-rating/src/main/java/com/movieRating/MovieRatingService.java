package com.movieRating;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class MovieRatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	public List<Rating> getMovieRatingProvidedByUser(String userId){
		return ratingRepository.findByUserId(userId);
	}
	
	public List<Rating> getRatingOfMovie(Integer movieId){
		return ratingRepository.findByMovieId(movieId);
	}
	
	public Integer addRating(Rating rating) {
		ratingRepository.save(rating);
		return rating.getMovieId();
		}
	
//	public Rating getRatingById(Integer movieId) {
//	Optional<Rating> optional= ratingRepository.findById(movieId);
//	System.out.println(optional);
//	return optional.get();
//	}
//	
//	public List<Rating> getAllMovie(){
//		List<Rating> rating = new ArrayList<>();
//		ratingRepository.findAll().forEach(rating::add);
//		return rating;
//	}
//	
//	
//	
//	public Integer updateMovieRating(Rating rating, Integer movieId) {
//		ratingRepository.save(rating);
//		return rating.getMovieId();
//	}
//	
//	public Integer delete(Integer movieId) {
//		ratingRepository.deleteById(movieId);
//		return movieId;
//}
	

}
