package com.RatingService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Rating_data")
@Data
@AllArgsConstructor
public class RatingEntity {

	@Id
	private String id;
	private String hotelId;
	private String userId;
	private int rate;
	private String feedback;
	
	public RatingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
