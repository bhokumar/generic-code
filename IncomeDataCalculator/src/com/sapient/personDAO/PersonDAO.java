package com.sapient.personDAO;

import com.sapient.currencyMap.CurrencyMap;

public class PersonDAO {
	@Override
	public String toString() {
		return "PersonDAO [country=" + country + ", gender=" + gender + ", currency=" + currency + ", amount=" + amount
				+ "]";
	}

	private String country;
	private char gender;
	private String currency;
	private double amount;
    private int count;
    
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void incAmount(double amount) {
		this.amount += amount;
	}

	public double calculateAverageIncome() {
		double d = 0.0;
	
		d = (1 / CurrencyMap.concurrencyMap.get(currency)) * amount;

		return d;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + gender;
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
		PersonDAO other = (PersonDAO) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (gender != other.gender)
			return false;
		return true;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void incCount() {
		this.count = this.count + 1;
	}
	
}
