package com.RatingService.controllers;

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

import com.RatingService.entity.RatingEntity;
import com.RatingService.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping
	public ResponseEntity<?> addRating(@RequestBody RatingEntity entity){
		ratingService.addRating(entity);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<?> getAllRating(){
		List<RatingEntity> allRating = ratingService.getAllRating();
		return new ResponseEntity<>(allRating,HttpStatus.OK);
	}
	
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getRatingByUserId(@PathVariable String id) {
		List<RatingEntity> byUserId = ratingService.getRatingByUserId(id);
		return new ResponseEntity<>(byUserId,HttpStatus.OK);
		
	}
	
	
	@GetMapping("/hotel/{id}")
	public ResponseEntity<?> getRatingByHotelId(@PathVariable String id) {
		List<RatingEntity> byHotelId = ratingService.getRatingByHotelId(id);
		return new ResponseEntity<>(byHotelId,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	

}
