package com.taxi.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	private Long id;
	private String vehicle;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setCity(String vehicle) {
		this.vehicle = vehicle;
	}
	
	
}
