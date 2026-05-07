package com.irctc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Entity class
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TRAIN_DATA")
public class Train {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long trainId;
	private String trainName;
	private String source;
	private String destination;
	private Integer availableSeats;
	private Double price;
	public void setTrainId(Long trainId) {
		this.trainId = trainId;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
