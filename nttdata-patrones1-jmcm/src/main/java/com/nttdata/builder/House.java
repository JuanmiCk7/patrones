package com.nttdata.builder;

public class House {
	
	private double squareMeters;
	
	private boolean hasBasement;
	
	private boolean hasUpstairs;
	
	private String address;

	public House() {}

	public double getSquareMeters() {
		return squareMeters;
	}

	public void setSquareMeters(double squareMeters) {
		this.squareMeters = squareMeters;
	}

	public boolean isHasBasement() {
		return hasBasement;
	}

	public void setHasBasement(boolean hasBasement) {
		this.hasBasement = hasBasement;
	}

	public boolean isHasUpstairs() {
		return hasUpstairs;
	}

	public void setHasUpstairs(boolean hasUpstairs) {
		this.hasUpstairs = hasUpstairs;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
