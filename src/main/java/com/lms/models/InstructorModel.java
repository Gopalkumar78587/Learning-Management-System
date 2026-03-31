package com.lms.models;

import java.util.ArrayList;
import java.util.List;

public class InstructorModel {
	public int ID;
	public String name;
	public String email;
	public String password;
	public long phone;
	public List<CourseModel> ownCourses=new ArrayList<>();
	public List<AssignmentModel>assignments=new ArrayList<>();
	
	public InstructorModel(int ID,String name,String email,String password,long phone) {
		this.ID=ID;
		this.name=name;
		this.email=email;
		this.password=password;
		this.phone=phone; 
	}
}
