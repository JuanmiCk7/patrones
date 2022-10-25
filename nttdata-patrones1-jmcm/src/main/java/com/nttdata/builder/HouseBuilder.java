package com.nttdata.builder;

public class HouseBuilder implements IHouseBuilder {

	private double squareMeters;
	
	private boolean hasBasement;
	
	private boolean hasUpstairs;
	
	private String address;
	
	public HouseBuilder() {
		
	}
	
	public HouseBuilder withSquareMeters(double squareMeters) {
		this.squareMeters = squareMeters;
		return this;
	}
	
	public HouseBuilder withHasBasement(boolean hasBasement) {
		this.hasBasement = hasBasement;
		return this;
	}
	
	public HouseBuilder withHasUpstairs(boolean hasUpstairs) {
		this.hasUpstairs = hasUpstairs;
		return this;
	}
	
	public HouseBuilder withAddress(String address) {
		this.address = address;
		return this;
	}

	@Override
	public House build() {
		House house = new House();
		
		house.setSquareMeters(this.squareMeters); 
		house.setHasBasement(this.hasBasement);
		house.setHasUpstairs(this.hasUpstairs);
		house.setAddress(this.address);
			
		return house;
	}
	
}
