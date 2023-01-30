package com.aviator.fr24.controller;

import com.aviator.fr24.service.RealTimeFlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RealTimeFlightController {

    public RealTimeFlightController(RealTimeFlightService realTimeFlightService) {
        this.realTimeFlightService = realTimeFlightService;
    }

    public RealTimeFlightController(){

    }

    private RealTimeFlightService realTimeFlightService;

    @GetMapping("/flights/realtimeflights/listall")
    public String getRTF(Model model){

        model.addAttribute("flights",realTimeFlightService.listFlights());
        return "listflights";
    }


}
