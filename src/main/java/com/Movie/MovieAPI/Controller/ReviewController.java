package com.Movie.MovieAPI.Controller;

import com.Movie.MovieAPI.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

}
