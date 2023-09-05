package com.Movie.MovieAPI.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "Moviedata")//name of the table
@Data//takes care of getter setter method extract from lambok
@AllArgsConstructor //creating
public class Movie {
    @Id
    private ObjectId Id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String Poster;
    private List<String> genres;
    private List<String> backdropes;
    @DocumentReference//embedded relationships
    private List<Reviews> reviews;



}
