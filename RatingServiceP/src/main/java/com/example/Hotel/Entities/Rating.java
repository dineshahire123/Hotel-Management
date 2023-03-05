package com.example.Hotel.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rating {
	
	@Id
	private String ratingId;
	private String userId;
	private String hotelId;
	private String rating;
	private String remark;
}
