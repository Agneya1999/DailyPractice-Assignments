package com.movieService;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MovieServiceRepo extends CrudRepository<Movie, Integer>{
   public Movie findByMovieName(String movieName);
}
