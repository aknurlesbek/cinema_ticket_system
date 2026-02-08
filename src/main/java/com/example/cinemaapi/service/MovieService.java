package com.example.cinemapi.service;

import com.example.cinemapi.model.Movie;
import com.example.cinemapi.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public int addMovie(Movie movie) {
        return movieRepository.addMovie(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.getAllMovies();
    }
}
