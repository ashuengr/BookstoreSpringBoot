package com.cg.bookstore.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
private String city;
private int zipCode;
private String Country;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getZipCode() {
	return zipCode;
}
public void setZipCode(int zipCode) {
	this.zipCode = zipCode;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public Address() {
	super();
}
public Address(String city, int zipCode, String country) {
	super();
	this.city = city;
	this.zipCode = zipCode;
	Country = country;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Country == null) ? 0 : Country.hashCode());
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + zipCode;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Address other = (Address) obj;
	if (Country == null) {
		if (other.Country != null)
			return false;
	} else if (!Country.equals(other.Country))
		return false;
	if (city == null) {
		if (other.city != null)
			return false;
	} else if (!city.equals(other.city))
		return false;
	if (zipCode != other.zipCode)
		return false;
	return true;
}
@Override
public String toString() {
	return "Address [city=" + city + ", zipCode=" + zipCode + ", Country=" + Country + "]";
}

}
