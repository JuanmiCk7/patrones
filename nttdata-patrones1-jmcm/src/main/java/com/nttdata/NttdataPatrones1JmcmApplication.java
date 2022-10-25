package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nttdata.builder.House;
import com.nttdata.builder.HouseBuilder;
import com.nttdata.singleton.Persona;

@SpringBootApplication
public class NttdataPatrones1JmcmApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(NttdataPatrones1JmcmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Singleton Object name: "+((Persona)context.getBean("personaSingleton")).getName());
		
		HouseBuilder builder = new HouseBuilder();
		
		House house = builder.withSquareMeters(200)
				 .withHasBasement(true)
				 .withHasUpstairs(false)
				 .withAddress("12345")
				 .build();
		
		System.out.println("El piso en dirección " + house.getAddress() + " tiene " + house.getSquareMeters() + " metros cuadrados.");
		
		if(house.isHasBasement()) {
			System.out.println("El piso tiene sótano");
		} else {
			System.out.println("El piso no tiene sótano");
		}
		
		if(house.isHasUpstairs()) {
			System.out.println("El piso tiene segunda planta");
		} else {
			System.out.println("El piso no tiene segunda planta");
		}
	}

}
