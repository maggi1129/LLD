package com.bosscoder;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchService implements ISearchService{

    Map<String, List<Movie>> cityMovieMap;
    Map<Date, List<Movie>> dateMovieMap;
    Map<MovieHall, List<Movie>> movieHallMovieMap;
    Map<String, List<Movie>> nameMovieMap;
    Map<Genre, List<Movie>> genreMovieMap;

    @Override
    public List<Movie> searchMovieByName(String keyword) {

        return nameMovieMap.get(keyword);
    }

    @Override
    public List<Movie> searchMovieByCity(String keyword) {
        return cityMovieMap.get(keyword);
    }

    @Override
    public List<Movie> searchMovieByDate(Date date) {
        return dateMovieMap.get(date);
    }

    @Override
    public List<Movie> searchMovieByMovieHall(String keyword) {
        return movieHallMovieMap.get(keyword);
    }

    @Override
    public List<Movie> searchMovieByGenre(Genre genre) {
        return genreMovieMap.get(genre);
    }
}
