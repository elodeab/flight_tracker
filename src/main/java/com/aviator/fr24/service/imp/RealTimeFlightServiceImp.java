package com.aviator.fr24.service.imp;

import com.aviator.fr24.entity.RealTimeFlight;
import com.aviator.fr24.repository.RealTimeFlightRepository;
import com.aviator.fr24.service.RealTimeFlightService;

import java.util.List;

public class RealTimeFlightServiceImp implements RealTimeFlightService {

    public RealTimeFlightServiceImp(RealTimeFlightRepository realTimeFlightRepository) {
        this.realTimeFlightRepository = realTimeFlightRepository;
    }

    private RealTimeFlightRepository realTimeFlightRepository;

    @Override
    public List<RealTimeFlight> listFlights() {
        return realTimeFlightRepository.findAll();
    }
}
