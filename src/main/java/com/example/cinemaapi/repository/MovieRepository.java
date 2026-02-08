package com.example.cinemapi.repository;

import com.example.cinemapi.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepository {

    private final JdbcTemplate jdbcTemplate;

    public MovieRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Фильмді қосу
    public int addMovie(Movie movie) {
        String sql = "INSERT INTO movies (title, genre, duration) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, movie.getTitle(), movie.getGenre(), movie.getDuration());
    }

    // Барлық фильмдерді алу
    public List<Movie> getAllMovies() {
        String sql = "SELECT * FROM movies";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Movie(
                rs.getLong("id"),
                rs.getString("title"),
                rs.getString("genre"),
                rs.getInt("duration")
        ));
    }
}
