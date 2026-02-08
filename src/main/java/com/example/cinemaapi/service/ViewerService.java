package com.example.cinemapi.service;

import com.example.cinemapi.model.Viewer;
import com.example.cinemapi.repository.ViewerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewerService {

    private final ViewerRepository viewerRepository;

    public ViewerService(ViewerRepository viewerRepository) {
        this.viewerRepository = viewerRepository;
    }

    public int addViewer(Viewer viewer) {
        return viewerRepository.addViewer(viewer);
    }

    public List<Viewer> getAllViewers() {
        return viewerRepository.getAllViewers();
    }
}
