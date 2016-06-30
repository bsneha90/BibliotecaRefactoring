package com.biblioteca;

/**
 * Created by bsneha on 6/30/2016.
 */
public class Movie {

    private String title;
    private  String director;
    private  String rating;

    public Movie(String title, String director, String rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
       return  this.title + " - Director: " + this.director + " Rating: " + this.rating;
    }
}
