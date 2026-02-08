package com.example.cinemapi.repository;

import com.example.cinemapi.model.Viewer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ViewerRepository {

    private final JdbcTemplate jdbcTemplate;

    public ViewerRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Көрерменді қосу
    public int addViewer(Viewer viewer) {
        String sql = "INSERT INTO viewers (name, email) VALUES (?, ?)";
        return jdbcTemplate.update(sql, viewer.getName(), viewer.getEmail());
    }

    // Барлық көрермендерді алу
    public List<Viewer> getAllViewers() {
        String sql = "SELECT * FROM viewers";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Viewer(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("email")
        ));
    }
}
