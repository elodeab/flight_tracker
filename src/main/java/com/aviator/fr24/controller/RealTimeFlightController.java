package com.aviator.fr24.controller;

import com.aviator.fr24.entity.RealTimeFlight;
import com.aviator.fr24.service.RealTimeFlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
public class RealTimeFlightController {

    public RealTimeFlightController(RealTimeFlightService realTimeFlightService) {
        this.realTimeFlightService = realTimeFlightService;
    }

    private RealTimeFlightService realTimeFlightService;

    @GetMapping("/realtimeflights/list")
    public String getRTF(Model model){
        model.addAttribute("flights",realTimeFlightService.listFlights());
        return "listFlights";
    }

    @GetMapping("/realtimeflights/new")
    public String newFlightInfo(Model model){

        RealTimeFlight rtf = new RealTimeFlight();
        model.addAttribute("newFlightInfo",rtf);
        return "createFlightInfo";
    }

    @PostMapping("/realtimeflights")
    public String saveFlightInfo(@ModelAttribute RealTimeFlight newFlightInfo) {
        realTimeFlightService.saveInfo(newFlightInfo);
        return "redirect:/realtimeflights/list";
    }

    @GetMapping("/realtimeflights/edit/{id}")
    public String editFlightInfo(@PathVariable UUID id, Model model ){
        model.addAttribute("flight",realTimeFlightService.getFlightById(id));
        return "edit_flight";
    }

    @PostMapping("/realtimeflights/{id}")
    public String updateFlightInfo(@PathVariable UUID id,
                                @ModelAttribute("flight")
                                RealTimeFlight realTimeFlight, Model model ){

        RealTimeFlight existingFlight = realTimeFlightService.getFlightById(id);
        existingFlight.setId(id);
        existingFlight.setAircraftIataCode(realTimeFlight.getAircraftIataCode());
        existingFlight.setAircraftIcaoCode(realTimeFlight.getAircraftIcaoCode());
        existingFlight.setAircraftIcao24(realTimeFlight.getAircraftIcao24());
        existingFlight.setAircraftRegNumber(realTimeFlight.getAircraftRegNumber());
        existingFlight.setArrivalIata(realTimeFlight.getArrivalIata());
        existingFlight.setArrivalIcao(realTimeFlight.getArrivalIcao());
        existingFlight.setDepartureIata(realTimeFlight.getDepartureIata());
        existingFlight.setDepartureIcao(realTimeFlight.getDepartureIcao());
        existingFlight.setStatus(realTimeFlight.getStatus());
        existingFlight.setSpeed(realTimeFlight.getSpeed());

        realTimeFlightService.updateFlight(existingFlight);
        return "redirect:/realtimeflights/list";
    }

    @GetMapping("/realtimeflights/{id}")
    public String deleteFlightInfo(@PathVariable UUID id){
        realTimeFlightService.deleteFlightById(id);
        return "redirect:/realtimeflights/list";
    }


}
