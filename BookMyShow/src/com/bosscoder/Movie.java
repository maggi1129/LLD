package com.bosscoder;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Movie {

    String movieId;
    String movieName;
    Genre genre;
    Date startTime;
    Date endTime;
    String language;
    List<MovieHall> movieHallList;

    Map<String, List<MovieHall>> moviePerCityMap;

    public List<MovieHall> getMovieHallList() {
        return movieHallList;
    }

    public List<MovieHall> getMovieHallByCity(String city){
        return moviePerCityMap.get(city);
    }
}
