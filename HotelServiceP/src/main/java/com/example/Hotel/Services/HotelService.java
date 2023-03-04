package com.example.Hotel.Services;

import java.util.List;

import com.example.Hotel.Entities.Hotel;

public interface HotelService {
    //create
	Hotel create(Hotel hotel);
	//getAll
	List<Hotel> getAll();
	//get Single
	Hotel get(String id);
}
