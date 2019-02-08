package com.taxi.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taxi.demo.Entity.UserDetails;
import com.taxi.demo.service.TaxiService;

@Controller
public class TaxiController {

	@Autowired
	private TaxiService taxiservice;
	
	@GetMapping("/booktaxi")
	 public	String show(HttpServletRequest req)

	 {
		req.setAttribute("area", taxiservice.show());
		req.setAttribute("city",taxiservice.show1() );
		req.setAttribute("vehicle", taxiservice.show2());
		 return "demo";
	 }
	
	@PostMapping("/save")
	public String init(@ModelAttribute UserDetails user)
	{
		taxiservice.add(user);
		return "demo1";
	}
	
	@GetMapping("/show")
	public List<UserDetails> view()
	{
		return taxiservice.view();
		
	}
	
//	public String init(@RequestBody UserDetails user)
//	{
//		taxiservice.add(user);
//		return "demo1";
//	}
	
	
}
