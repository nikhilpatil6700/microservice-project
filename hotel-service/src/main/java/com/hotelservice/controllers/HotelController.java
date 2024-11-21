package com.hotelservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelservice.Entity.HotelEntity;
import com.hotelservice.service.HotelService;


@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getHotel(@PathVariable String id){
		HotelEntity hotel = hotelService.getHotel(id);
		return new ResponseEntity<>(hotel,HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<?> addNewHotel(@RequestBody HotelEntity hotel){
		HotelEntity addNewHotel = hotelService.AddNewHotel(hotel);
	    return new ResponseEntity<>(addNewHotel,HttpStatus.OK);

	}

	@GetMapping()
	public ResponseEntity<?> getAllHotel(){
		List<HotelEntity> allHotel = hotelService.getAllHotel();
		return new ResponseEntity<>(allHotel,HttpStatus.OK);

		
	}


}
