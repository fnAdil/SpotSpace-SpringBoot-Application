package com.example.spotspace.spots.service;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.spotspace.spots.dto.SpotResponseDTO;
import com.example.spotspace.spots.model.Spot;
import com.example.spotspace.spots.repository.SpotRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SpotServiceImplementation implements ISpotService {
    private final SpotRepository spotRepository;
    private final ModelMapper mapper;

    @Override
    public List<SpotResponseDTO> getAllSpots() {
        List<Spot> spots = spotRepository.findAll();
        List<SpotResponseDTO> responses = spots
                .stream().map(spot -> mapper.map(spot, SpotResponseDTO.class)).toList();
        return responses;
    }

}
