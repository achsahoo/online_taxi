package com.taxi.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taxi.demo.Entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
