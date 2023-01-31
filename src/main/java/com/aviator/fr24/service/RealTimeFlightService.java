package com.aviator.fr24.service;
import java.util.List;
import java.util.UUID;

import com.aviator.fr24.entity.RealTimeFlight;

public interface RealTimeFlightService {
    List<RealTimeFlight> listFlights();

    RealTimeFlight saveInfo(RealTimeFlight realTimeFlight);

    RealTimeFlight updateFlight(RealTimeFlight realTimeFlight);

    RealTimeFlight getFlightById(UUID id);

    void deleteFlightById(UUID id);


}
