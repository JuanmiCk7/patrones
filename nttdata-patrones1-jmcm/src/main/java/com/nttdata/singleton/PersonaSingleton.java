package com.nttdata.singleton;

class PersonaSingleton {
	
	private static PersonaSingleton personaInstance;
	
	private String name;
	
	private int age;
	
	private PersonaSingleton() {
		
	}
	
	public static PersonaSingleton getInstance() {
		if(personaInstance == null) {
			personaInstance = new PersonaSingleton();
		}
		
		return personaInstance;
	}
	
	public void singletonOperation() {
		System.out.println("Hola, soy una persona!");
		System.out.printf("Mi nombre es %s y mi edad es %d%n", name, age);
	}
	
	

}
