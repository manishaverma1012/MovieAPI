package com.Movie.MovieAPI.Controller;

import com.Movie.MovieAPI.Model.Reviews;
import com.Movie.MovieAPI.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Reviews> CreateReview(@RequestBody Map<String,String> payload)
    {
        return new ResponseEntity<Reviews>(reviewService.createReviews(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.CREATED);
    }


}
