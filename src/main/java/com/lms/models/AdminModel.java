package com.lms.models;

public class AdminModel {	
	
	public int ID;
	public String name;
	public String email;
	public String password;
	
	public AdminModel(int ID, String name, String email,String password) {
		this.ID=ID;
		this.name=name;
		this.email=email;
		this.password=password;
		
	}
}
