package ar.com.desafio5.domain.users;

import ar.com.desafio5.domain.Entity;

public class Address extends Entity {
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	private String lat;
	private String lng;
	
	public Address(Long id, String street, String suite, String city, String zipcode, String lat, String lng) {
		this.id = id;
		init(street, suite, city, zipcode, lat, lng);
	}

	public Address(String street, String suite, String city, String zipcode, String lat, String lng) {
		init(street, suite, city, zipcode, lat, lng);
	}

	private void init(String street, String suite, String city, String zipcode, String lat, String lng) {
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipcode = zipcode;
		this.lat = lat;
		this.lng = lng;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode="
				+ zipcode + ", lat=" + lat + ", lng=" + lng + "]";
	}
	
//    "address": {
//    "street": "Kulas Light",
//    "suite": "Apt. 556",
//    "city": "Gwenborough",
//    "zipcode": "92998-3874",
//    "geo": {
//      "lat": "-37.3159",
//      "lng": "81.1496"
//    }
}
