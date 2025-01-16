package com.Mcs.hotel.service.HotelService.service;

import com.Mcs.hotel.service.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {
    //create hotel
    Hotel create(Hotel hotel);

    //get all hotel
    List<Hotel> getAll();

    //get single hotel
    Hotel getHotel(String hotelid);

}
