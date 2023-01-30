package com.aviator.fr24.repository;

import com.aviator.fr24.entity.RealTimeFlight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RealTimeFlightRepository extends JpaRepository<RealTimeFlight, UUID> {
}
