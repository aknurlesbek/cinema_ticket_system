package com.example.cinemabookingsystem.controller;

import com.example.cinemabookingsystem.model.CinemaBranch;
import com.example.cinemabookingsystem.repository.CinemaBranchRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cinema-branches")
public class CinemaBranchController {

    private final CinemaBranchRepository repository;

    public CinemaBranchController(CinemaBranchRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<CinemaBranch> getAll() {
        return (List<CinemaBranch>) repository.findAll();
    }

    @PostMapping
    public CinemaBranch create(@RequestBody CinemaBranch branch) {
        return repository.save(branch);
    }

    @PutMapping("/{id}")
    public CinemaBranch update(@PathVariable Integer id, @RequestBody CinemaBranch branch) {
        branch.setId(id);
        return repository.save(branch);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}
