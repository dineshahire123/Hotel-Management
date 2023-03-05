package com.example.Hotel.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hotel.Entities.Rating;
import com.example.Hotel.Repositories.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	private RatingRepository repository;
	
	
	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
	String rid = 	UUID.randomUUID().toString();

	rating.setRatingId(rid);

		return repository.save(rating);
	}

	@Override
	public List<Rating> getRatings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return repository.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return repository.findByUserId(hotelId);
	}

}
