package com.lms.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentModel {
	
	public int ID;
	public String name;
	public String email;
	public String password;
	public long phone;
	public List<CourseModel> enrolledCourses=new ArrayList<>();
	public Map<Integer,String>courseTracker=new HashMap<>();
	public List<SubmissionModel>submissoins=new ArrayList<>();
	
	public StudentModel(int ID,String name,String email,String password,long phone) {
		this.ID=ID;
		this.name=name;
		this.email=email;
		this.password=password;
		this.phone=phone;
	}
	
}
