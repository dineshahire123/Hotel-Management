package com.example.Hotel.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Hotel.Entities.Hotel;

@Repository
public interface HotelRepositories extends JpaRepository<Hotel, String> {

}
