package com.Mcs.hotel.service.HotelService.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException()
    {
        super("Rse");
    }

    public ResourceNotFoundException(String hotelIdNotFound) {
        super(hotelIdNotFound);
    }
}
