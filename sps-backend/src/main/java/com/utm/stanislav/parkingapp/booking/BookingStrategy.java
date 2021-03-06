package com.utm.stanislav.parkingapp.booking;

import com.utm.stanislav.parkingapp.exceptions.BookingException;
import com.utm.stanislav.parkingapp.model.Parking;
import com.utm.stanislav.parkingapp.model.ParkingLot;

import javax.inject.Named;

@Named
public interface BookingStrategy {
    
    ParkingLot book(Parking parking) throws BookingException;
}
