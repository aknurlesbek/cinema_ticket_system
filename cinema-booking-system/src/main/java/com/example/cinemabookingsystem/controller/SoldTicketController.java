package com.example.cinemabookingsystem.controller;

import com.example.cinemabookingsystem.model.SoldTicket;
import com.example.cinemabookingsystem.repository.SoldTicketRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sold-tickets")
public class SoldTicketController {

    private final SoldTicketRepository soldTicketRepository;

    public SoldTicketController(SoldTicketRepository soldTicketRepository) {
        this.soldTicketRepository = soldTicketRepository;
    }

    @GetMapping
    public Iterable<SoldTicket> getAllSoldTickets() {
        return soldTicketRepository.findAll();
    }

    @PostMapping
    public SoldTicket addSoldTicket(@RequestBody SoldTicket soldTicket) {
        return soldTicketRepository.save(soldTicket);
    }

    @PutMapping("/{id}")
    public SoldTicket updateSoldTicket(@PathVariable int id, @RequestBody SoldTicket soldTicket) {
        soldTicket.setId(id);
        return soldTicketRepository.save(soldTicket);
    }

    @DeleteMapping("/{id}")
    public void deleteSoldTicket(@PathVariable int id) {
        soldTicketRepository.deleteById(id);
    }
}
