package com.hotelservice.handleEcxeption;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
	
	public ResourceNotFoundException()
	{
		super("hotel not found");
	}

}
