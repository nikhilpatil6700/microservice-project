package com.hotelservice.loadpay;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ApiResponse {

	private String message;
	private boolean success;
	private HttpStatus httpStatus;
	
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
