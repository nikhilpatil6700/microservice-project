package com.hotelservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelservice.Entity.HotelEntity;
import com.hotelservice.handleEcxeption.ResourceNotFoundException;
import com.hotelservice.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public HotelEntity getHotel(String id) {
		HotelEntity entity = hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("hotel not found"));
		return entity;
	}

	@Override
	public HotelEntity AddNewHotel(HotelEntity entity) {
		entity.setId(UUID.randomUUID().toString());
		HotelEntity hotelEntity = hotelRepository.save(entity);
		return hotelEntity;
	}

	@Override
	public List<HotelEntity> getAllHotel() {
		List<HotelEntity> list = hotelRepository.findAll();
 		return list;
	}

}
