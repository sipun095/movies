package com.sip.mv.service;

import com.sip.mv.entity.Movies;

import java.util.Date;
import java.util.List;

public interface MovieService {
 public Movies saveMovie(Movies movies);

 List<Movies> getAllMovies();

 Movies getMoviesByMovieId(String moviesId);

 void deleteMoviesByMovieId(String moviesId);

 void updateReleaseDateByMovieId(String moviesId, Movies releaseDate);
}
