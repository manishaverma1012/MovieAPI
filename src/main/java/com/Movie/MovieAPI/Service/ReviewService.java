package com.Movie.MovieAPI.Service;

import com.Movie.MovieAPI.Model.Movie;
import com.Movie.MovieAPI.Model.Reviews;
import com.Movie.MovieAPI.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Reviews createReviews(String reviewbody, String imdbId) {
        Reviews reviews = reviewRepository.insert(new Reviews(reviewbody));
        mongoTemplate.update(Movie.class).matching(Criteria.where("imdbId").is(imdbId)).apply(new Update().push("Id").value(reviews)).first();
        return reviews;
    }
}

