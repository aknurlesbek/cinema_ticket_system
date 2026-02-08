package com.example.cinemapi.controller;

import com.example.cinemapi.model.Cinema;
import com.example.cinemapi.service.CinemaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {

    private final CinemaService cinemaService;

    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @PostMapping
    public String addCinema(@RequestBody Cinema cinema) {
        cinemaService.addCinema(cinema);
        return "Cinema added successfully";
    }

    @GetMapping
    public List<Cinema> getAllCinemas() {
        return cinemaService.getAllCinemas();
    }
}
