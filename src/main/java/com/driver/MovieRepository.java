package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;

@Repository
public class MovieRepository {
    static HashSet<Movie> movies = new HashSet<>();
    static HashSet<Director> directors = new HashSet<>();
    static HashMap<Movie,Director> moviedirector = new HashMap<>();
    public static String addMovie(Movie mov) {
        movies.add(mov);
        return "success";
    }

    public static String addDirector(Director dir) {
        directors.add(dir);
        return "success";
    }

    public static String addMobieDirectorPair(String moviename, String dire) {
        boolean c1 = false, c2 = false;
        Movie tempmov = null;
        Director tempdir = null;
        for(Movie mob : movies){
            if(mob.getName().equals(moviename)) {
                tempmov = mob;
                c1 = true;
            }
        }
        for(Director dir : directors){
            if(dir.getName().equals(dire)) {
                tempdir = dir;
                c2 = true;
            }
        }
        if(c1 && c2){
            moviedirector.put(tempmov,tempdir);
            return "success";
        }
        return "Movie Not Found";
    }
}
