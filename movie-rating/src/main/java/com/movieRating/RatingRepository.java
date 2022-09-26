package com.movieRating;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RatingRepository extends CrudRepository<Rating, RatingKey> {
   public List<Rating> findByUserId(String userId);
   public List<Rating> findByMovieId(Integer movieId);
}
