package com.taxi.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taxi.demo.Entity.Area;

public interface AreaRepository extends JpaRepository<Area, Long>{

}
