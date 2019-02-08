	package com.taxi.demo.Entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name="User_details")
public class UserDetails {

	@Id
	@OnDelete(action = OnDeleteAction.CASCADE)
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="userid" ,length=50)
	private Long userid;
	
	
	
	@Column(name="contactnumber" )
	private String mobilenumber;
	
	@Column(name="bookingdate" )
//	@Temporal(TemporalType.DATE)
	private String bookingdate;
	
	@Column(name="bookingtime" )
	private String bookingtime;
	
	@Column(name="username" )
	private String customername;
	
	@Column(name="address" )
	private String address;
	
	

	@Column(name="numberofpas" )
	private String numberofpas;
	
	@Column(name="numberofbag" )
	private String numberofbag;
	
	@Column(name="numberofvehicle" )
	private String numberofvehicle;
	
	@Column(name="price" )
	private String price;
	
	@Column(name="flightnumber")
	private String flightnumber;
	
	@Column(name="flightdate")
	private String flightdate;
	
	@Column(name="flighttime")
	private String flighttime;
	
	@Column(name="email")
	private String email;
	
	
	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	public String getFlightdate() {
		return flightdate;
	}

	public void setFlightdate(String flightdate) {
		this.flightdate = flightdate;
	}

	public String getFlighttime() {
		return flighttime;
	}

	public void setFlighttime(String flighttime) {
		this.flighttime = flighttime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	



	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}

	public String getBookingtime() {
		return bookingtime;
	}

	public void setBookingtime(String bookingtime) {
		this.bookingtime = bookingtime;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String username) {
		this.customername = username;
	}

	public String getNumberofpas() {
		return numberofpas;
	}

	public void setNumberofpas(String numberofpas) {
		this.numberofpas = numberofpas;
	}

	public String getNumberofbag() {
		return numberofbag;
	}

	public void setNumberofbag(String numberofbag) {
		this.numberofbag = numberofbag;
	}

	public String getNumberofvehicle() {
		return numberofvehicle;
	}

	public void setNumberofvehicle(String numberofvehicle) {
		this.numberofvehicle = numberofvehicle;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

//	public UserDetails(Long userid, Long mobilenumber, Date bookingdate, Date bookingtime, Long customername,
//			String address, Long numberofpas, Long numberofbag, Long numberofvehicle, Long price) {
//		super();
//		this.userid = userid;
//		this.mobilenumber = mobilenumber;
//		this.bookingdate = bookingdate;
//		this.bookingtime = bookingtime;
//		this.customername = customername;
//		this.address = address;
//		this.numberofpas = numberofpas;
//		this.numberofbag = numberofbag;
//		this.numberofvehicle = numberofvehicle;
//		this.price = price;
//	}
//	
//	
//	
//	public UserDetails() {
//		super();
//		
//	}
	
}
