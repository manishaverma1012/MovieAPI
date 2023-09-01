package com.Movie.MovieAPI.Service;

import com.Movie.MovieAPI.Model.Movie;
import com.Movie.MovieAPI.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> AllMovies()
    {
        System.out.println(movieRepository.findAll().toString()) ;
        return movieRepository.findAll();

    }
    public Optional<Movie> SingleMovie(String imdbId) //optional movie will say that if null id will be given then Optional class will handle this;
    {
        return movieRepository.findMovieByimdbId(imdbId);
    }
}
