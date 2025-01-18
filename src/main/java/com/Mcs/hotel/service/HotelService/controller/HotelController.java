package com.Mcs.hotel.service.HotelService.controller;

import com.Mcs.hotel.service.HotelService.entities.Hotel;
import com.Mcs.hotel.service.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    //create
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
    {
        Hotel hotel1=hotelService.create(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }
    //get All hotel
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel()
    {
       List<Hotel> hotels=hotelService.getAll();
       return ResponseEntity.ok(hotels);
    }

    //get single hotel
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/{hotel}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotel)
    {
        Hotel hotel1=hotelService.getHotel(hotel);
        return ResponseEntity.ok(hotel1);
    }


}
