package com.sip.mv.controller;

import com.sip.mv.entity.Movies;
import com.sip.mv.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/movie")
@Tag(name = "MovieController" , description = "MovieController")
public class MovieController {


    @Autowired
    private MovieService movieService;
    @PostMapping("/addMovie")
    @Operation(summary = "add Movie" ,description = "Movies_service")
    public ResponseEntity<?> addMovie(@RequestBody Movies moviesModel){
      Movies movie=movieService.saveMovie(moviesModel);
      return ResponseEntity.ok(movie);
    }

    @GetMapping("/getAllMovies")
    public ResponseEntity<?> getAllMovies(){
        List<Movies> listMovie=movieService.getAllMovies();
        return ResponseEntity.ok(listMovie);

    }
    @GetMapping("/getMoviesById/{moviesId}")
    public ResponseEntity<?> getMoviesByMovieId(@PathVariable("moviesId") String moviesId){
        Movies movie=movieService.getMoviesByMovieId(moviesId);
        return ResponseEntity.ok(movie);
    }
   @DeleteMapping("/deleteMoviesById/{moviesId}")
    public ResponseEntity<?> deleteMovieByMovieId(@PathVariable("moviesId") String moviesId){
        movieService.deleteMoviesByMovieId(moviesId);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
   @PutMapping("/updateReleaseDate/{moviesId}")
    public ResponseEntity<?> updateReleaseDateByMovieId(@RequestBody Movies releaseDate,@PathVariable("moviesId") String moviesId){
        movieService.updateReleaseDateByMovieId(moviesId,releaseDate);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }


}
