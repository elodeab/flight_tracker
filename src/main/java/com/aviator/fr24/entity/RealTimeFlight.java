package com.aviator.fr24.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="RealTimeFlight")
public class RealTimeFlight {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;


    // aircraft
    @Column(name="aircraftIataCode",nullable = false)
    private String aircraftIataCode;

    @Column(name="aircraftIcaoCode")
    private String aircraftIcaoCode;

    @Column(name="aircraftIcao24")
    private String aircraftIcao24;

    @Column(name="aircraftRegNumber")
    private String aircraftRegNumber;

    // arrival
    @Column(name = "a_iata", nullable = false)
    private String arrivalIata;

    @Column(name="a_icao")
    private String arrivalIcao;

    // departure

    @Column(name = "d_iata", nullable = false)
    private String departureIata;

    @Column(name = "d_icao")
    private String departureIcao;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAircraftIataCode() {
        return aircraftIataCode;
    }

    public void setAircraftIataCode(String aircraftIataCode) {
        this.aircraftIataCode = aircraftIataCode;
    }

    public String getAircraftIcaoCode() {
        return aircraftIcaoCode;
    }

    public void setAircraftIcaoCode(String aircraftIcaoCode) {
        this.aircraftIcaoCode = aircraftIcaoCode;
    }

    public String getAircraftIcao24() {
        return aircraftIcao24;
    }

    public void setAircraftIcao24(String aircraftIcao24) {
        this.aircraftIcao24 = aircraftIcao24;
    }

    public String getAircraftRegNumber() {
        return aircraftRegNumber;
    }

    public void setAircraftRegNumber(String aircraftRegNumber) {
        this.aircraftRegNumber = aircraftRegNumber;
    }

    public String getArrivalIata() {
        return arrivalIata;
    }

    public void setArrivalIata(String arrivalIata) {
        this.arrivalIata = arrivalIata;
    }

    public String getArrivalIcao() {
        return arrivalIcao;
    }

    public void setArrivalIcao(String arrivalIcao) {
        this.arrivalIcao = arrivalIcao;
    }

    public String getDepartureIata() {
        return departureIata;
    }

    public void setDepartureIata(String departureIata) {
        this.departureIata = departureIata;
    }

    public String getDepartureIcao() {
        return departureIcao;
    }

    public void setDepartureIcao(String departureIcao) {
        this.departureIcao = departureIcao;
    }
}

