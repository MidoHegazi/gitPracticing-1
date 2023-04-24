package com.midoHegazi.gitPractice1.entity;

import org.springframework.lang.NonNull;

public class Employee {
	
	@NonNull
	private String name;
	@NonNull
	private String lastName;
	@NonNull
	private String age;
	
	public Employee( String name, String lastName, String age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	

}
