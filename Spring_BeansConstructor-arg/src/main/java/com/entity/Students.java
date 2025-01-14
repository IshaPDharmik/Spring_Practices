package com.entity;

public class Students {

	private int id;
	private String name;
	private int age;
	private String city;

	private Country con;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	public Students() {

	}

	public Students(int id, String name, int age, String city, Country con) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.con = con;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", con=" + con + "]";
	}

}
