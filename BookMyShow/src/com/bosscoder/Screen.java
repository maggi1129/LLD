package com.bosscoder;

import java.util.List;

public class Screen {

    int screenId;
    String screenName;
    List<Movie> movieList;
    List<Seat> seatList;

    public List<Movie> getMovieList(){
        return movieList;
    }

}
