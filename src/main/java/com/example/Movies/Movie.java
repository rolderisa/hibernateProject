package com.example.Movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.Collections;
import java.util.List;

@Document(collection="movies")
@Data
@AllArgsConstructor
public class Movie {
    @Id
    private  Object id;

    private String imdbId;
    private  String title;
    private  String releaseDate;
    private  String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<String> reviewIds;





}
