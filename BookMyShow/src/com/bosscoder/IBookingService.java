package com.bosscoder;

import java.util.List;

public interface IBookingService {

    List<Movie> getMovies(String city);

    List<MovieHall> getMovieHallList(String city);
}


