package com.example.spotspace.spots.service;

import java.util.List;

import com.example.spotspace.spots.dto.SpotResponseDTO;

public interface ISpotService {
    public List<SpotResponseDTO> getAllSpots();
}
