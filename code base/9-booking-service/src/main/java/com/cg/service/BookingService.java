package com.cg.service;

import com.cg.dto.BookingDTO;
import com.cg.entity.Booking;

public interface BookingService {
	  public Booking createBooking(BookingDTO bookingDto);
}
