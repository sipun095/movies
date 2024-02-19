package com.sip.mv.serviceImpl;

import com.sip.mv.entity.Movies;
import com.sip.mv.repository.MovieesRepository;
import com.sip.mv.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service("MoviesServiceImpl")
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieesRepository movieesRepository;
    @Override
    public Movies saveMovie(Movies movies) {

        return movieesRepository.save(movies);
    }

    @Override
    public List<Movies> getAllMovies() {
        return movieesRepository.findAll();
    }

    @Override
    public Movies getMoviesByMovieId(String moviesId) {
      return movieesRepository.findById(Integer.parseInt(moviesId)).get();

    }

    @Override
    public void deleteMoviesByMovieId(String moviesId) {
        movieesRepository.deleteById(Integer.parseInt(moviesId));
    }

    @Override
    public void updateReleaseDateByMovieId(String moviesId, Movies movie) {
        Movies movies=movieesRepository.findById(Integer.parseInt(moviesId)).orElse(null);
        if(movies!=null){
            movies.setRelease_date(movie.getRelease_date());
            movieesRepository.save(movies);
        }

    }
}
