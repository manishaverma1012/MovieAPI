package com.Movie.MovieAPI.Controller;

import com.Movie.MovieAPI.Model.Movie;
import com.Movie.MovieAPI.Service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class Controller {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies()
    {
        return new ResponseEntity<List<Movie>>(movieService.AllMovies(), HttpStatus.OK);
        // it will give proper return knowledege that request has been successful with success code 200;
    }
    @GetMapping("/{Id}")
    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable ObjectId Id)
    {
        return new ResponseEntity<Optional<Movie>>(movieService.SingleMovie(Id),HttpStatus.OK);

    }

//    @PutMapping
//    @PostMapping
//    @DeleteMapping



}