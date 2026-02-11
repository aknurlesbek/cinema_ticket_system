package com.example.cinemabookingsystem.controller;

import com.example.cinemabookingsystem.model.MovieSession;
import com.example.cinemabookingsystem.repository.MovieSessionRepository;
import org.springframework.web.bind.annotation.*; // Барлық Mapping-тер үшін
import java.util.List;

@RestController
@RequestMapping("/movie-sessions")
public class MovieSessionController {

    private final MovieSessionRepository repository;

    public MovieSessionController(MovieSessionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<MovieSession> getAll() {
        return (List<MovieSession>) repository.findAll();
    }

    @PostMapping
    public MovieSession create(@RequestBody MovieSession session) {
        return repository.save(session);
    }

    @PutMapping("/{id}")
    public MovieSession update(@PathVariable Integer id, @RequestBody MovieSession session) {
        session.setId(id);
        return repository.save(session);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}