package com.taxi.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taxi.demo.Entity.Area;
import com.taxi.demo.Entity.City;
import com.taxi.demo.Entity.UserDetails;
import com.taxi.demo.Entity.Vehicle;
import com.taxi.demo.dao.AreaRepository;
import com.taxi.demo.dao.CityRepository;
import com.taxi.demo.dao.TaxiRepository;
import com.taxi.demo.dao.VehicleRepository;

@Service
public class TaxiService {

	@Autowired
	private TaxiRepository taxiRepository;
	@Autowired
	private AreaRepository areaRepository;
	@Autowired
    private CityRepository cityRepository;
	@Autowired
	private VehicleRepository vehicleRepository;
	
	
	public void add(UserDetails user) {
		
		
		taxiRepository.save(user);
		
	}

	public Iterable<Area> show(){
		return areaRepository.findAll();
	}
	
	public Iterable<City> show1(){
		return cityRepository.findAll();
	}
	
	public Iterable<Vehicle> show2(){
		return vehicleRepository.findAll();
	}

	public List<UserDetails> view() {
		// TODO Auto-generated method stub
		return taxiRepository.findAll();
	}

	

	
}
