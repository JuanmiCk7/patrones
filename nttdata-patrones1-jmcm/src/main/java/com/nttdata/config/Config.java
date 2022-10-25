package com.nttdata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nttdata.singleton.Persona;

@Configuration
public class Config {

	@Bean(name ="personaSingleton")
	@Scope("singleton")
	public Persona personaSingleton() { return new Persona ("Juanmi", 22);}
	
	@Bean(name ="personaPrototype")
	@Scope("prototype")
	public Persona personaPrototype() { return new Persona ("Juanmi", 22);}
}
