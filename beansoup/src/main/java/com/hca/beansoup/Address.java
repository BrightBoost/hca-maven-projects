package com.hca.beansoup;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String street;
	private String houseNr;
	
	public String getStreet() {
		return street;
	}
	public String getHouseNr() {
		return houseNr;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setHouseNr(String houseNr) {
		this.houseNr = houseNr;
	}

}
