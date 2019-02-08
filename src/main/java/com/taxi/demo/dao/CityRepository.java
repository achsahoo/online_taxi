package com.taxi.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taxi.demo.Entity.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
