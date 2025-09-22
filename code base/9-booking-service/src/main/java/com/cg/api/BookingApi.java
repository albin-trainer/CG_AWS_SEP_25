package com.cg.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.BookingDTO;
import com.cg.entity.Booking;
import com.cg.service.BookingService;

@RestController
@RequestMapping("/book")
public class BookingApi {
	@Autowired
	private BookingService bookingService;
	@PostMapping
	  public Booking createBooking(@RequestBody  BookingDTO bookingDto) {
		  return bookingService.createBooking(bookingDto);
	  }
}
