package com.Movie.MovieAPI.Repository;

import com.Movie.MovieAPI.Model.Movie;
import com.Movie.MovieAPI.Model.Reviews;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Reviews, ObjectId>{


}
