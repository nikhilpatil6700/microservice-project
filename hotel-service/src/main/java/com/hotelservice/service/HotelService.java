package com.hotelservice.service;

import java.util.List;

import com.hotelservice.Entity.HotelEntity;

public interface HotelService {
	
	//get one hotel detail
	HotelEntity getHotel(String id);
	
	
	//add new hotel
	HotelEntity AddNewHotel(HotelEntity entity);
	
	//get all hotel
	List<HotelEntity> getAllHotel();

}
