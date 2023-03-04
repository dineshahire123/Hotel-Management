package com.example.Hotel.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hotel.Entities.Hotel;
import com.example.Hotel.Exception.ResourceNotFoundException;
import com.example.Hotel.Repositories.HotelRepositories;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepositories hotelrepositories;
	
	
	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
	 String hotelId = UUID.randomUUID().toString();
	
	 hotel.setId(hotelId);
	 return hotelrepositories.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return hotelrepositories.findAll();
	}

	@Override
	public Hotel get(String id) {
		// TODO Auto-generated method stub
		return hotelrepositories.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given Id is not Found !!"));
	}

}
