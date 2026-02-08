package com.example.cinemapi.controller;

import com.example.cinemapi.model.Viewer;
import com.example.cinemapi.service.ViewerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viewers")
public class ViewerController {

    private final ViewerService viewerService;

    public ViewerController(ViewerService viewerService) {
        this.viewerService = viewerService;
    }

    @PostMapping
    public String addViewer(@RequestBody Viewer viewer) {
        viewerService.addViewer(viewer);
        return "Viewer added successfully";
    }

    @GetMapping
    public List<Viewer> getAllViewers() {
        return viewerService.getAllViewers();
    }
}
