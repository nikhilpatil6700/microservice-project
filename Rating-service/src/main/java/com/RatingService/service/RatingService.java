package com.RatingService.service;

import java.util.List;

import com.RatingService.entity.RatingEntity;

public interface RatingService {

	void addRating(RatingEntity entity);
	
	List<RatingEntity> getAllRating();
	
	List<RatingEntity> getRatingByUserId(String id);
	
	List<RatingEntity> getRatingByHotelId(String id);
	
}
