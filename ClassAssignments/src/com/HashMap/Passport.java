package com.HashMap;

import java.util.Objects;

public class Passport {

	public int id;
	public String country;
	public String date;
	
	public Passport(int id, String country, String date) {
		super();
		this.id = id;
		this.country = country;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Passport [id=" + id + ", country=" + country + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, date, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passport other = (Passport) obj;
		return Objects.equals(country, other.country) && Objects.equals(date, other.date) && id == other.id;
	}
	
	
}
