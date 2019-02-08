package com.taxi.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Area {

	@Id
	private Long id;
	  
	private String area;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea1(String area) {
		this.area = area;
	}
	
	public Area(Long id, String area) {
		super();
		this.id = id;
		this.area = area;
		
	}
	
	public Area() {
		super();
		
	}
	
	
}
