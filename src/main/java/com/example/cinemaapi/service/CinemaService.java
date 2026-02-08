package com.example.cinemapi.service;

import com.example.cinemapi.model.Cinema;
import com.example.cinemapi.repository.CinemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService {

    private final CinemaRepository cinemaRepository;

    public CinemaService(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    public int addCinema(Cinema cinema) {
        return cinemaRepository.addCinema(cinema);
    }

    public List<Cinema> getAllCinemas() {
        return cinemaRepository.getAllCinemas();
    }
}
