package com.Mcs.hotel.service.HotelService.service.impl;

import com.Mcs.hotel.service.HotelService.exception.ResourceNotFoundException;
import com.Mcs.hotel.service.HotelService.entities.Hotel;
import com.Mcs.hotel.service.HotelService.repository.HotelRepository;
import com.Mcs.hotel.service.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String id=UUID.randomUUID().toString();
        hotel.setId(id);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String hotelid) {
        return hotelRepository.findById(hotelid).orElseThrow(()-> new ResourceNotFoundException("Hotel id not found"));
    }
}
