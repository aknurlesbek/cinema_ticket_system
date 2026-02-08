package com.example.cinemapi.repository;

import com.example.cinemapi.model.Cinema;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CinemaRepository {

    private final JdbcTemplate jdbcTemplate;

    public CinemaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Кинотеатрды қосу
    public int addCinema(Cinema cinema) {
        String sql = "INSERT INTO cinemas (name, location) VALUES (?, ?)";
        return jdbcTemplate.update(sql, cinema.getName(), cinema.getLocation());
    }

    // Барлық кинотеатрларды алу
    public List<Cinema> getAllCinemas() {
        String sql = "SELECT * FROM cinemas";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Cinema(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("location")
        ));
    }
}
