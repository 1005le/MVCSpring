package com.demo.mvcspring.model;

public class Order {
 private Person person;
 
 public Order(Person person2) {
	this.person = person2;
}
public Person getPerson() {
   return person;	 
 }
 public void setPerson(Person person) {
	 this.person = person;
 }
 
}
