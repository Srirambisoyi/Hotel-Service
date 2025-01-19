package com.Mcs.hotel.service.HotelService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @GetMapping
    public ResponseEntity<List<String>> getStaff()
    {
        List<String> staff= Arrays.asList("sriram","sibani","chandan","lucky","mama");
        return ResponseEntity.ok(staff);
    }
}
