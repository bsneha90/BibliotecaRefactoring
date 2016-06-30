package com.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by bsneha on 6/30/2016.
 */
public class MovieTest {
    @Test
    public void shouldBeAbleToGeteAMovieNameWiitTitleDirectorAndRating(){
        Movie movie = new Movie("MovieA","Dir", "12");
        assertEquals(  "MovieA - Director: Dir Rating: 12" ,movie.getName());
    }
}
