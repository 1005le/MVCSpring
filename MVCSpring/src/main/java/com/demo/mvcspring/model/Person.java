package com.demo.mvcspring.model;

public class Person {
	//Helllo Person
private String name;
private String address;


public Person(String name, String address) {
	super();
	this.name = name;
	this.address = address;
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
private void init() {
	// TODO Auto-generated method stub

}
private void destroy() {
	// TODO Auto-generated method stub

}

}
