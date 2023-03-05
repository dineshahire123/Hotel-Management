package com.example.Hotel.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Hotel.Entities.Rating;

@Service
public interface RatingService {

	//create
	
	Rating create(Rating rating);
	
	//get all ratings
	
	List<Rating> getRatings();
	
	//get all by UserId
	
	List<Rating> getRatingByUserId(String userId);
	
	
	//get all by hotel
	
	List<Rating> getRatingByHotelId(String hotelId);
	
}
