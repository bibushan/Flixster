package com.bibushan.api.flixster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewIds;

    public Movie(String imdbId, String title) {
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = "";
        this.trailerLink = "";
        this.poster = "";
        this.genres = new ArrayList<String>();
        this.reviewIds = new ArrayList<Review>();
    }
}