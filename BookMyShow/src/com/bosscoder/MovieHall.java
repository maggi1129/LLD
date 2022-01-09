package com.bosscoder;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class MovieHall {

    Address address;
    String movieHallId;
    String movieHallName;

    List<Screen> screenList;

    //Map date, movies

    Map<Date, List<Movie>> movieSchedule;

    public List<Movie> getMovieList(Date date){
        return movieSchedule.get(date);
    }

}
