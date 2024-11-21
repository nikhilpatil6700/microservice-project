package com.hotelservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Hotel_data")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelEntity {
	@Id
	private String id;
	private String name;
	private String address;

}
