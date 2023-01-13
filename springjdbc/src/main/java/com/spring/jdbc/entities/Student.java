package com.spring.jdbc.entities;

public class Student {
	private int id;
	private String Name;
	private String Address;
	public Student(int id, String Name, String Address) {
		super();
		this.id = id;
		this.Name = Name;
		this.Address = Address;
	}
	public Student() {
		super();
		this.id = id;
		this.Name = Name;
		this.Address = Address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Address=" + Address + "]";
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	

}
