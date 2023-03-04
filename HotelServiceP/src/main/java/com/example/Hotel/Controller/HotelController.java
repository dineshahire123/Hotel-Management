package com.example.Hotel.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hotel.Entities.Hotel;
import com.example.Hotel.Services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	//create
	
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
	}
	
	
	//get single
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.get(hotelId));
	}
	
	
	//get All
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAll(){
		return ResponseEntity.ok(hotelService.getAll());
	} 
	
}
