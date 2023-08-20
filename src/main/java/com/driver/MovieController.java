package com.driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
    @Autowired
    MovieService Movieservice;

    @PostMapping("/movies/add-movie")
    public ResponseEntity addMovie(@RequestBody Movie movie){
        String s = MovieService.addMovie(movie);
        return new ResponseEntity(s, HttpStatus.CREATED);
    }
    @PostMapping("/movies/add-director")
    public ResponseEntity addDirector(@RequestBody Director director){
        String s = MovieService.addDirector(director);
        return new ResponseEntity(s,HttpStatus.CREATED);
    }
    @PutMapping("/movies/add-movie-director-pair")
    public ResponseEntity addMovieDirectorPair(@RequestParam("movie") String moviename, @RequestParam("dir") String Dir){
        String s = MovieService.addMovieDirectorPair(moviename,Dir);
        return new ResponseEntity(s,HttpStatus.CREATED);
    }

}
