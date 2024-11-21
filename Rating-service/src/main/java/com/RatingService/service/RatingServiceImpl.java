package com.RatingService.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RatingService.entity.RatingEntity;
import com.RatingService.entity.UserEntity;
import com.RatingService.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public void addRating(RatingEntity entity) {

		entity.setId(UUID.randomUUID().toString());
		ratingRepository.save(entity);
		
	}

	@Override
	public List<RatingEntity> getAllRating() {
		List<RatingEntity> list = ratingRepository.findAll();
		return list;
	}

	@Override
	public List<RatingEntity> getRatingByUserId(String id)  {
		
		List<RatingEntity> userList = ratingRepository.findByUserId(id);

		return userList;
	}

	@Override
	public List<RatingEntity> getRatingByHotelId(String id)  {
		
		List<RatingEntity> hotelList = ratingRepository.findByHotelId(id);
		return hotelList;
	}

}
