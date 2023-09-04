package com.example.spotspace.spots.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spotspace.spots.dto.SpotResponseDTO;
import com.example.spotspace.spots.service.ISpotService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SpotsController {
    private final ISpotService spotService;

    @GetMapping("/spots")
    public List<SpotResponseDTO> list() {
        return spotService.getAllSpots();
    }
}
