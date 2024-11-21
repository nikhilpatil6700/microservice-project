package com.RatingService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RatingService.entity.RatingEntity;

@Repository
public interface RatingRepository  extends JpaRepository<RatingEntity, String>{
	
	List<RatingEntity> findByUserId(String id);
	
	List<RatingEntity> findByHotelId(String id);

}
