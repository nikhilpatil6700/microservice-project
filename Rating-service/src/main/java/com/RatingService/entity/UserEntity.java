package com.RatingService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

	private String id;
	private String name;
	private String email;
	private String about;
}
