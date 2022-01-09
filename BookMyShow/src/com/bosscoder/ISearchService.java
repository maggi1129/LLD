package com.bosscoder;

import java.util.Date;
import java.util.List;

public interface ISearchService {

    List<Movie> searchMovieByName(String keyword);

    List<Movie> searchMovieByCity(String keyword);

    List<Movie> searchMovieByDate(Date date);

    List<Movie> searchMovieByMovieHall(String keyword);

    List<Movie> searchMovieByGenre(Genre genre);

}
