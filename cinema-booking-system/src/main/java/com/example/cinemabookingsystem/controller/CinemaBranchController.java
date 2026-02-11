package com.example.cinemabookingsystem.controller;

import com.example.cinemabookingsystem.model.CinemaBranch;
import com.example.cinemabookingsystem.repository.CinemaBranchRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cinema-branches")  // Дұрыс жолдың аннотациясы
public class CinemaBranchController {

    private final CinemaBranchRepository cinemaBranchRepository;

    public CinemaBranchController(CinemaBranchRepository cinemaBranchRepository) {
        this.cinemaBranchRepository = cinemaBranchRepository;
    }

    @GetMapping
    public Iterable<CinemaBranch> getAllCinemaBranches() {
        return cinemaBranchRepository.findAll();
    }

    @PostMapping
    public CinemaBranch addCinemaBranch(@RequestBody CinemaBranch cinemaBranch) {
        return cinemaBranchRepository.save(cinemaBranch);
    }

    @PutMapping("/{id}")
    public CinemaBranch updateCinemaBranch(@PathVariable int id, @RequestBody CinemaBranch cinemaBranch) {
        cinemaBranch.setId(id);
        return cinemaBranchRepository.save(cinemaBranch);
    }

    @DeleteMapping("/{id}")
    public void deleteCinemaBranch(@PathVariable int id) {
        cinemaBranchRepository.deleteById(id);
    }
}
