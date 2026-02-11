package com.example.cinemabookingsystem.repository;

import com.example.cinemabookingsystem.model.SoldTicket;
import org.springframework.data.repository.CrudRepository;

public interface SoldTicketRepository extends CrudRepository<SoldTicket, Integer> {
}
