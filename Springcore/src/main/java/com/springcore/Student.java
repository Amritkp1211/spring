package com.springcore;

public class Student {
   private int id;
   String name,address;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
}
public Student(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
}
