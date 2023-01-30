package com.aviator.fr24.controller;

import com.aviator.fr24.entity.RealTimeFlight;
import com.aviator.fr24.service.RealTimeFlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
        // Create student object to hold student from data
        RealTimeFlight rtf = new RealTimeFlight();
        model.addAttribute("newFlightInfo",rtf);
        return "createFlightInfo";
    }

    @PostMapping("/realtimeflights")
    public String saveFlightInfo(@ModelAttribute RealTimeFlight newFlightInfo) {
        realTimeFlightService.saveInfo(newFlightInfo);
        return "redirect:/realtimeflights/list";
    }



}
