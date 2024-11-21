package com.hotelservice.handleEcxeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hotelservice.loadpay.ApiResponse;

@RestControllerAdvice
public class HandleGlobalException {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException ex)
	{
		String message = ex.getMessage();
		
		ApiResponse response = ApiResponse.builder().message(message).success(true).httpStatus(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}
	

}
