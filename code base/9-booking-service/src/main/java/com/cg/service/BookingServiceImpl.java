package com.cg.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.dto.BookingDTO;
import com.cg.dto.CabDTO;
import com.cg.dto.UserDTO;
import com.cg.entity.Booking;
import com.cg.entity.Status;
import com.cg.repository.BookingRepository;
@Service
public class BookingServiceImpl implements BookingService {
	@Autowired
	private BookingRepository bookingRepo;
	@Autowired
 private RestTemplate template;
	private String userSearchUrl="http://7-user-service/users";
	private String cabSearchUrl="http://8-cab-service/cabs/search?cabType=";
	@Override
	public Booking createBooking(BookingDTO bookingDto) {
		int uid=bookingDto.getUserId();
		String cabType=bookingDto.getCabType();
		
		UserDTO userDto=template.getForObject(userSearchUrl+"/"+uid, UserDTO.class);
		if(userDto==null) {
			throw new RuntimeException("user not found");
		}
		else {
			CabDTO cabDto=template.getForObject(cabSearchUrl+cabType, CabDTO.class);
			if(cabDto==null)
				throw new RuntimeException("Cab not found");
			Booking booking=new Booking();
			booking.setCabId(cabDto.getCabId());
			booking.setUserId(uid);
			booking.setBookingDate(LocalDateTime.now());
			booking.setStatus(Status.BOOKED);
			return bookingRepo.save(booking);
		}
		
	}

}
