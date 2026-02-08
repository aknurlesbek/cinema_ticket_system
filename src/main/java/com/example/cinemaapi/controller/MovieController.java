package com.example.cinemapi.controller;

import com.example.cinemapi.model.Movie;
import com.example.cinemapi.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public String addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
        return "Movie added successfully";
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
}
