package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movierepository;

    public static String addMovie(Movie movie) {
        return MovieRepository.addMovie(movie);
    }

    public static String addDirector(Director director) {
        return MovieRepository.addDirector(director);
    }

    public static String addMovieDirectorPair(String moviename, String dir) {
        return MovieRepository.addMobieDirectorPair(moviename,dir);
    }
}
