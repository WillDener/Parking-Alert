package com.fatec.parkingalert.controller;

import com.fatec.parkingalert.model.ParkingSpot;
import com.fatec.parkingalert.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @GetMapping
    public ResponseEntity<ParkingSpot> buscarVaga (){
        return parkingService.buscarVaga();
    }


}
