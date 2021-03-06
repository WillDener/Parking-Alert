package com.fatec.parkingalert.service;

import com.fatec.parkingalert.model.ParkingSpot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ParkingService {

    public ResponseEntity<ParkingSpot> buscarVaga(){
        RestTemplate template = new RestTemplate();
        return template.getForEntity("http://127.0.0.1:5000/", ParkingSpot.class);
    }
}
