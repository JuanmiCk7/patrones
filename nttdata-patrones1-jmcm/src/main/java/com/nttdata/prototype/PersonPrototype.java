package com.nttdata.prototype;

public class PersonPrototype implements IClonable {
	
	private String name;
	
	private int age;
	
	public PersonPrototype(PersonPrototype person) {
		this.name = person.getName();
		this.age = person.getAge();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public PersonPrototype copy() {
		return new PersonPrototype(this);
	}
	
	
	
}
