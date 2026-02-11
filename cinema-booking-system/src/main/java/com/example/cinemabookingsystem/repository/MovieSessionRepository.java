package com.example.cinemabookingsystem.repository;

import com.example.cinemabookingsystem.model.MovieSession;
import org.springframework.data.repository.CrudRepository;

public interface MovieSessionRepository extends CrudRepository<MovieSession, Integer> {
}
