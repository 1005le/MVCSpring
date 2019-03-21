package com.demo.mvcspring.model;

import java.util.List;

public class User {
private String name;
private String password;
private int id;
private List<String> favorites;
private String about;
private String gender;
private boolean acceptAgreement;


public User() {
	
}

public User(String name, String password, int id, List<String> favorites, String about,String gender, boolean acceptAgreement) {
	super();
	this.name = name;
	this.password = password;
	this.id = id;
	this.favorites = favorites;
	this.about = about;
	this.gender= gender;
	this.acceptAgreement = acceptAgreement;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public List<String> getFavorites() {
	return favorites;
}

public void setFavorites(List<String> favorites) {
	this.favorites = favorites;
}

public String getAbout() {
	return about;
}

public void setAbout(String about) {
	this.about = about;
}

public boolean isAcceptAgreement() {
	return acceptAgreement;
}

public void setAcceptAgreement(boolean acceptAgreement) {
	this.acceptAgreement = acceptAgreement;
}

public User(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
